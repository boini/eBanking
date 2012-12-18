package com.ebanking.ws.service.impl.addCard;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.dao.CardTypeDAO;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.model.card.CardType;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.AddCardRQ;
import com.ebanking.ws.service.response.AddCardRS;

import java.util.Date;

public class AddCardService extends SpringSupportService implements Service<AddCardRQ, AddCardRS> {
    private CardAccountDAO cardAccountDAO;
    private CardTypeDAO cardTypeDAO;
    private CardDAO cardDAO;

    @Override
    public AddCardRS execute(AddCardRQ request) {
        cardAccountDAO = (CardAccountDAO) getBean("cardAccountDAO");
        cardTypeDAO = (CardTypeDAO) getBean("cardTypeDAO");
        cardDAO = (CardDAO) getBean("cardDAO");

        long cardAccountId = request.getCardAccountId();
        String cardNumber = request.getCardNumber();
        String cvv = request.getCvv();
        String cardType = request.getCardType();
        double creditLimit = request.getCreditLimit();
        Date date = request.getExpirationDate();

        CardAccount cardAccount = cardAccountDAO.getById(cardAccountId);
        CardType type = cardTypeDAO.getCardTypeByName(cardType);

        Card card = new Card();
        card.setCardAccount(cardAccount);
        card.setCardNumber(cardNumber);
        card.setCardType(type);
        card.setCreditLimit(creditLimit);
        card.setCvv(cvv);
        card.setExpirationDate(date);

        cardDAO.saveOrUpdate(card);

        AddCardRS addCardRS = new AddCardRS();
        addCardRS.setSuccess(true);

        return addCardRS;
    }
}
