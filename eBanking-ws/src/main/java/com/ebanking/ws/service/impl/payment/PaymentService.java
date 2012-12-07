package com.ebanking.ws.service.impl.payment;

import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.dao.OperationStatusDAO;
import com.ebanking.ws.dao.OperationTypeDAO;
import com.ebanking.ws.dao.CorporationDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.account.Corporation;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.model.operation.OperationTypeEnum;
import com.ebanking.ws.operation.factory.OperationFactory;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.impl.payment.validator.PaymentValidator;
import com.ebanking.ws.service.request.PaymentRQ;
import com.ebanking.ws.service.response.PaymentRS;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 6:54 AM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class PaymentService extends SpringSupportService implements Service<PaymentRQ, PaymentRS> {

    private OperationDAO operationDAO;
    private CardDAO cardDAO;
    private CorporationDAO corporationDAO;
    private OperationStatusDAO operationStatusDAO;
    private OperationTypeDAO operationTypeDAO;

    @Override
    public PaymentRS execute(PaymentRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        operationDAO = (OperationDAO) getBean("operationDAO");
        cardDAO = (CardDAO) getBean("cardDAO");
        corporationDAO = (CorporationDAO) getBean("corporationDAO");
        operationTypeDAO = (OperationTypeDAO) getBean("operationTypeDAO");
        operationStatusDAO = (OperationStatusDAO) getBean("operationStatusDAO");

        logger.logRQRS(request, PaymentService.class);

        PaymentRS paymentRS = new PaymentRS();

        if (PaymentValidator.validate(request)) {
            double amount = request.getAmount();
            Client client = request.getClient();
            long cardId = request.getFrom();
            String corporationName = request.getTo();
            String operationKey = request.getKey();
            Date processingDate = request.getDate();

            Operation operation = OperationFactory.getSingleton().operationWithType(OperationTypeEnum.PAYMENT);

            List<Card> clientCards = cardDAO.getCardsByClientId(client.getClientId());
            for (Card card : clientCards) {
                if (card.getCardId() == cardId) {
                    operation.setCard(card);
                    break;
                }
            }

            operation.setTransactionAmount(amount);

            Corporation corporation = corporationDAO.getCorporationByName(corporationName);
            Set<BankAccount> bankAccountList = corporation.getBankAccountList();

            for (BankAccount bankAccount : bankAccountList) {
                if (bankAccount.getCurrency().equals(operation.getCard().getCardAccount().getCurrency())) {
                    operation.setContractorAccount(bankAccount);
                    break;
                }
            }

            operation.setOperationKey(operationKey);

            operation.setProcessingDate(processingDate);

            operationDAO.saveOrUpdate(operation);

            paymentRS.setSuccess(true);
        } else {
            paymentRS.setSuccess(false);
            paymentRS.setException("Bad request");
        }

        logger.logRQRS(paymentRS, PaymentService.class);

        return paymentRS;
    }
}
