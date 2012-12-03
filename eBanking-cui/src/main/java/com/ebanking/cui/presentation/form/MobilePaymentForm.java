package com.ebanking.cui.presentation.form;

import com.ebanking.cui.model.card.Card;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/3/12
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class MobilePaymentForm {
    private List<Card> cards;
    private double amount;
    private String number;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
