package com.ebanking.ws.operation.payment.processor;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.dao.OperationStatusDAO;
import com.ebanking.ws.log.mailer.MailService;
import com.ebanking.ws.log.mailer.model.Mail;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.model.operation.OperationType;
import com.ebanking.ws.model.operation.OperationTypeEnum;
import com.ebanking.ws.operation.checker.BankAccountChecker;
import com.ebanking.ws.operation.checker.CardAccountChecker;
import com.ebanking.ws.operation.factory.OperationFactory;
import com.ebanking.ws.operation.transfer.MoneyTransfer;
import com.ebanking.ws.utils.TransferUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class PaymentOperationProcessor {

    private OperationDAO operationDAO;
    private OperationStatusDAO operationStatusDAO;
    private MoneyTransfer moneyTransfer;
    private OperationFactory operationFactory;
    private MailService mailService;
    private TransferUtils transferUtils;

    @Autowired
    public void setTransferUtils(TransferUtils transferUtils) {
        this.transferUtils = transferUtils;
    }

    @Autowired
    public void setMailService(MailService mailService) {
        this.mailService = mailService;
    }

    @Autowired
    public void setOperationDAO(OperationDAO operationDAO) {
        this.operationDAO = operationDAO;
    }
    @Autowired
    public void setOperationStatusDAO(OperationStatusDAO operationStatusDAO) {
        this.operationStatusDAO = operationStatusDAO;
    }
    @Autowired
    public void setMoneyTransfer(MoneyTransfer moneyTransfer) {
        this.moneyTransfer = moneyTransfer;
    }
    @Autowired
    public void setOperationFactory(OperationFactory operationFactory) {
        this.operationFactory = operationFactory;
    }

    public void process(Operation operation) {
        operation.setOperationStatus(
                operationStatusDAO.getOperationStatusByCode(
                        OperationStatusEnum.PROCESSING_OPERATION.getOperationStatus()));
        operationDAO.saveOrUpdate(operation);

        boolean success = false;
        OperationType operationType = operation.getOperationType();

        CardAccount clientCardAccount = operation.getCard().getCardAccount();
        Card contractorCard = null;
        if (OperationTypeEnum.PAYMENT.getOperationType().equals(operationType.getOperationType())) {
            BankAccount corporationBankAccount = operation.getContractorAccount();
            success = moneyTransfer.transfer(clientCardAccount, corporationBankAccount, operation.getTransactionAmount());
        } else if (OperationTypeEnum.TRANSFER_TO.getOperationType().equals(operationType.getOperationType())) { // TT(transfer to) or TF(transfer from) operation
            contractorCard = operation.getContractorCard();
            success = moneyTransfer.transfer(clientCardAccount, contractorCard.getCardAccount(), operation.getTransactionAmount());
        } else if (OperationTypeEnum.CHARGE.getOperationType().equals(operationType.getOperationType())) {
            BankAccount bankAccount = operation.getContractorAccount();
            success = moneyTransfer.transfer(bankAccount, clientCardAccount, operation.getTransactionAmount());
        }

        Operation additionalOperation = null;
        if (success) {
            operation.setOperationStatus(
                    operationStatusDAO.getOperationStatusByCode(
                            OperationStatusEnum.COMPLETED_OPERATION.getOperationStatus()));
            operation.setTransactionDate(new Date());
            operation.setCardAccountAmount(clientCardAccount.getBalance());
            //if operation type was TT(transfer to) we need to initiate one more operation TF(transfer from)
            if (OperationTypeEnum.TRANSFER_TO.getOperationType().equals(operationType.getOperationType())) {

                additionalOperation = operationFactory.operationWithType(
                        OperationTypeEnum.TRANSFER_FROM, OperationStatusEnum.COMPLETED_OPERATION);

                additionalOperation.setCard(operation.getContractorCard());
                additionalOperation.setContractorCard(operation.getCard());
                additionalOperation.setTransactionAmount(transferUtils.convert(
                        clientCardAccount.getCurrency(), contractorCard.getCardAccount().getCurrency(),
                        operation.getTransactionAmount()));
                additionalOperation.setProcessingDate(new Date());
                additionalOperation.setCardAccountAmount(contractorCard.getCardAccount().getBalance());
                additionalOperation.setTransactionDate(operation.getTransactionDate());
            }
        } else {
            operation.setOperationStatus(
                    operationStatusDAO.getOperationStatusByCode(
                            OperationStatusEnum.ERROR_OPERATION.getOperationStatus()));
        }
        operationDAO.saveOrUpdate(operation);

        if (additionalOperation != null) {
            operationDAO.saveOrUpdate(additionalOperation);
        }

        String email = clientCardAccount.getClient().getEmail();
        String contractor = (operation.getContractorAccount() != null) ?
                operation.getContractorAccount().getCorporation().getDescription() :
                "card";
        String descr = operation.getOperationType().getDescription() +
                " " +
                contractor;
        String amount = Double.toString(operation.getTransactionAmount()) +
                " " +
                clientCardAccount.getCurrency().getCurrencyCode();

        String name = clientCardAccount.getClient().getFirstname() + " " + clientCardAccount.getClient().getLastname();
        mailService.prepareMail(email, new Mail(descr, amount, name));
    }
}
