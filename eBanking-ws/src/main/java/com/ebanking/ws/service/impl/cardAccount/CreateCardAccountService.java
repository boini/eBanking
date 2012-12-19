package com.ebanking.ws.service.impl.cardAccount;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.dao.CurrencyDAO;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.model.finance.Currency;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.AddCardAccountRQ;
import com.ebanking.ws.service.response.AddCardAccountRS;

public class CreateCardAccountService extends SpringSupportService implements Service<AddCardAccountRQ, AddCardAccountRS> {
    private CardAccountDAO cardAccountDAO;
    private CurrencyDAO currencyDAO;
    private ClientDAO clientDAO;

    @Override
    public AddCardAccountRS execute(AddCardAccountRQ request) {
        cardAccountDAO = (CardAccountDAO) getBean("cardAccountDAO");
        currencyDAO = (CurrencyDAO) getBean("currencyDAO");
        clientDAO = (ClientDAO) getBean("clientDAO");

        long clientId = request.getClientId();
        String number = request.getNumber();
        String currencyCode = request.getCurrency();

        AddCardAccountRS addCardAccountRS = new AddCardAccountRS();

        Currency currency = currencyDAO.getCurrencyByCode(currencyCode);
        if (currency == null) {
            addCardAccountRS.setSuccess(false);
            addCardAccountRS.setException("Connection problem");
            return addCardAccountRS;
        }

        CardAccount cardAccount = cardAccountDAO.getCardAccountByNumber(number);
        if (cardAccount != null) {
            addCardAccountRS.setSuccess(false);
            addCardAccountRS.setException("Such card account number is already exist");
            return addCardAccountRS;
        }

        Client client = clientDAO.getById(clientId);

        CardAccount newCardAccount = new CardAccount();
        newCardAccount.setBalance(0D);
        newCardAccount.setClient(client);
        newCardAccount.setCurrency(currency);
        newCardAccount.setNumber(number);

        cardAccountDAO.saveOrUpdate(newCardAccount);

        addCardAccountRS.setSuccess(true);
        return addCardAccountRS;
    }
}
