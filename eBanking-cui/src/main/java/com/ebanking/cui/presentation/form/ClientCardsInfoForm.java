package com.ebanking.cui.presentation.form;

import com.ebanking.cui.model.card.Card;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/30/12
 * Time: 4:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClientCardsInfoForm {
    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
