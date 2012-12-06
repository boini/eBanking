package com.ebanking.ws.service.response;

import com.ebanking.ws.model.card.Card;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/29/12
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientCardsRS {
    private Card[] cards;

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "ClientCardsRS{" +
                "cards=" + (cards == null ? null : Arrays.asList(cards)) +
                '}';
    }
}
