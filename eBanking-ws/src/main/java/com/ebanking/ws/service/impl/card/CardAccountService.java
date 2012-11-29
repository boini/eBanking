package com.ebanking.ws.service.impl.card;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.CardAccountRQ;
import com.ebanking.ws.service.response.CardAccountRS;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 6:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardAccountService extends SpringSupportService implements Service<CardAccountRQ, CardAccountRS> {

    private CardAccountDAO cardAccountDAO;

    @Override
    public CardAccountRS execute(CardAccountRQ request) {
        cardAccountDAO = (CardAccountDAO) getBean("cardAccountDAO");

        Long clientId = request.getClientId();
        CardAccountRS cardAccountRS = new CardAccountRS();

        if (clientId != null) {
            List<CardAccount> cardAccounts = cardAccountDAO.listByClientId(clientId);
            if (cardAccounts != null && !cardAccounts.isEmpty()) {
                for (CardAccount cardAccount : cardAccounts) {
                    Set<Card> cards = cardAccount.getCards();
                    cardAccount.setClient(null);
                    for (Card card : cards) {
                        card.setCardAccountID(cardAccount.getCardAccountId());
                        card.setCardAccount(null);
                    }
                }
                cardAccountRS.setCardAccounts(cardAccounts);
            }
        }
        return cardAccountRS;
    }
}
