package com.ebanking.ws.operation.payment.processor;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.dao.OperationStatusDAO;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.operation.checker.BankAccountChecker;
import com.ebanking.ws.operation.checker.CardAccountChecker;
import com.ebanking.ws.operation.transfer.MoneyTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

public class PaymentOperationProcessor {

    private OperationDAO operationDAO;
    private OperationStatusDAO operationStatusDAO;

    private MoneyTransfer moneyTransfer;

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

    public void process(Operation operation) {
        operation.setOperationStatus(
                operationStatusDAO.getOperationStatusByCode(
                OperationStatusEnum.PROCESSING_OPERATION.getOperationStatus()));
        operationDAO.saveOrUpdate(operation);

        CardAccount clientCardAccount = operation.getCard().getCardAccount();
        BankAccount corporationBankAccount = operation.getContractorAccount();

        boolean success = moneyTransfer.transfer(clientCardAccount, corporationBankAccount, operation.getTransactionAmount());

        if (success) {
            operation.setOperationStatus(
                    operationStatusDAO.getOperationStatusByCode(
                            OperationStatusEnum.COMPLETED_OPERATION.getOperationStatus()));
            operation.setTransactionDate(new Date());
        } else {
            operation.setOperationStatus(
                    operationStatusDAO.getOperationStatusByCode(
                            OperationStatusEnum.ERROR_OPERATION.getOperationStatus()));
        }
        operationDAO.saveOrUpdate(operation);
    }
}
