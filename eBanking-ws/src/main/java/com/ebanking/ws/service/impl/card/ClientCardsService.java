package com.ebanking.ws.service.impl.card;

import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.ClientCardsRQ;
import com.ebanking.ws.service.response.ClientCardsRS;
import com.ebanking.ws.utils.CardUtils;

import java.util.List;

import static com.ebanking.ws.utils.CardUtils.*;

public class ClientCardsService extends SpringSupportService implements Service<ClientCardsRQ, ClientCardsRS> {

    private CardDAO cardDAO;

    @Override
    public ClientCardsRS execute(ClientCardsRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        cardDAO = (CardDAO) getBean("cardDAO");

        logger.logRQRS(request, ClientCardsService.class);

        Long clientId = request.getClientId();

        List<Card> cards = cardDAO.getCardsByClientId(clientId);
        for (Card card : cards) {
            card.setCardAccountID(card.getCardAccount().getCardAccountId());
            CardAccount cardAccount = new CardAccount();
            cardAccount.setBalance(card.getCardAccount().getBalance());
            cardAccount.setCurrency(card.getCardAccount().getCurrency());
            card.setCardAccount(cardAccount);
        }
        for (Card card : cards) {
            hideCardInfo(card);
        }
        Card[] cardsArray = cards.toArray(new Card[cards.size()]);

        ClientCardsRS clientCardsRS = new ClientCardsRS();
        clientCardsRS.setCards(cardsArray);

        logger.logRQRS(clientCardsRS, ClientCardsService.class);

        return clientCardsRS;
    }
}
