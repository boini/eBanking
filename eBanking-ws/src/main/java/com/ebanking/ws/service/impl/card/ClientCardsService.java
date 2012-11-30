package com.ebanking.ws.service.impl.card;

import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.ClientCardsRQ;
import com.ebanking.ws.service.response.ClientCardsRS;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/29/12
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientCardsService extends SpringSupportService implements Service<ClientCardsRQ, ClientCardsRS> {

    private CardDAO cardDAO;

    @Override
    public ClientCardsRS execute(ClientCardsRQ request) {
        cardDAO = (CardDAO) getBean("cardDAO");

        Long clientId = request.getClientId();

        List<Card> cards = cardDAO.getCardsByClientId(clientId);
        for (Card card : cards) {
            card.setCardAccountID(card.getCardAccount().getCardAccountId());
            CardAccount cardAccount = new CardAccount();
            cardAccount.setBalance(card.getCardAccount().getBalance());
            cardAccount.setCurrency(card.getCardAccount().getCurrency());
            card.setCardAccount(cardAccount);
        }
        Card[] cardsArray = cards.toArray(new Card[cards.size()]);

        ClientCardsRS clientCardsRS = new ClientCardsRS();
        clientCardsRS.setCards(cardsArray);
        return clientCardsRS;
    }
}
