package com.ebanking.ws.service.impl.removeCard;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.RemoveCardRQ;
import com.ebanking.ws.service.response.RemoveCardRS;

public class RemoveCardService extends SpringSupportService implements Service<RemoveCardRQ, RemoveCardRS> {
    private CardDAO cardDAO;
    private CardAccountDAO cardAccountDAO;

    @Override
    public RemoveCardRS execute(RemoveCardRQ request) {
        cardDAO = (CardDAO) getBean("cardDAO");
        cardAccountDAO = (CardAccountDAO) getBean("cardAccountDAO");

        String type = request.getType();
        long id = request.getId();

        RemoveCardRS removeCardRS = new RemoveCardRS();

        RemoveCardType removeCardType = RemoveCardType.getRemoveCardType(type);
        if (removeCardType == null) {
            removeCardRS.setSuccess(false);
            removeCardRS.setException("Incorrect parameter!");
        }

        switch (removeCardType) {
            case CARD:
                Card card = cardDAO.getById(id);
                cardDAO.delete(card);
                break;
            case CARD_ACCOUNT:
                CardAccount cardAccount = cardAccountDAO.getById(id);
                cardAccountDAO.delete(cardAccount);
                break;
        }

        removeCardRS.setSuccess(true);
        return removeCardRS;
    }
}
