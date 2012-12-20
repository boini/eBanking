package com.ebanking.ws.service.impl.charge;

import com.ebanking.ws.dao.*;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.account.Corporation;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.model.finance.Currency;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.model.operation.OperationTypeEnum;
import com.ebanking.ws.operation.factory.OperationFactory;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.impl.charge.validator.ChargeValidator;
import com.ebanking.ws.service.request.ChargeRQ;
import com.ebanking.ws.service.response.ChargeRS;

import java.util.Date;
import java.util.List;

public class ChargeService extends SpringSupportService implements Service<ChargeRQ, ChargeRS> {
    private final static String EBANKING_CORPORATION_NAME = "EBANKING";

    private OperationDAO operationDAO;
    private BankAccountDAO bankAccountDAO;
    private CardDAO cardDAO;
    private CorporationDAO corporationDAO;
    private OperationFactory operationFactory;

    @Override
    public ChargeRS execute(ChargeRQ request) {
        operationDAO = (OperationDAO) getBean("operationDAO");
        bankAccountDAO = (BankAccountDAO) getBean("bankAccountDAO");
        cardDAO = (CardDAO) getBean("cardDAO");
        corporationDAO = (CorporationDAO) getBean("corporationDAO");
        operationFactory = (OperationFactory) getBean("operationFactoryBean");

        ChargeRS chargeRS = new ChargeRS();

        if (ChargeValidator.validate(request)) {
            double amount = request.getAmount();
            long fromBankAccountId = request.getFromBankAccount();
            long toCardId = request.getToCardAccount();
            Date processingDate = request.getDate();

            Operation operation = operationFactory.operationWithType(
                    OperationTypeEnum.CHARGE, OperationStatusEnum.NEW_OPERATION);

            Card card = cardDAO.getById(toCardId);
            Corporation corporation = corporationDAO.getCorporationByName(EBANKING_CORPORATION_NAME);
            BankAccount bankAccount = bankAccountDAO.getByCurrencyAndName(
                    card.getCardAccount().getCurrency(), corporation);


            operation.setTransactionAmount(amount);
            operation.setContractorAccount(bankAccount);
            operation.setCard(card);
            operation.setProcessingDate(processingDate);

            operationDAO.saveOrUpdate(operation);

            chargeRS.setSuccess(true);
        } else {
            chargeRS.setSuccess(false);
            chargeRS.setException("Bad request");
        }

        return chargeRS;
    }
}
