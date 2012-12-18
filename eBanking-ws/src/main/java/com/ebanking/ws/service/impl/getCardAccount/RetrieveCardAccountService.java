package com.ebanking.ws.service.impl.getCardAccount;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.RetrieveCardAccountRQ;
import com.ebanking.ws.service.response.RetrieveCardAccountRS;

import java.util.List;

public class RetrieveCardAccountService extends SpringSupportService implements Service<RetrieveCardAccountRQ, RetrieveCardAccountRS> {
    private CardAccountDAO cardAccountDAO;

    @Override
    public RetrieveCardAccountRS execute(RetrieveCardAccountRQ request) {
        cardAccountDAO = (CardAccountDAO) getBean("cardAccountDAO");

        long clientId = request.getClientId();

        List<CardAccount> cardAccounts = cardAccountDAO.listByClientId(clientId);
        for (CardAccount cardAccount : cardAccounts) {
            cardAccount.setCards(null);
        }
        CardAccount[] cardAccountArr = cardAccounts.toArray(new CardAccount[cardAccounts.size()]);

        RetrieveCardAccountRS retrieveCardAccountRS = new RetrieveCardAccountRS();
        retrieveCardAccountRS.setCardAccounts(cardAccountArr);
        retrieveCardAccountRS.setSuccess(true);

        return retrieveCardAccountRS;
    }
}
