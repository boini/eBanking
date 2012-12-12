package com.ebanking.cui.presentation.form.transfer;

import com.ebanking.cui.model.card.Card;

import java.util.Date;
import java.util.List;

public class TransferForm {
    private List<Card> cards;
    private long fromCardId;
    private long toCardId;
    private double amount;
    private double equivalentAmount;
    private Date date;

    public double getEquivalentAmount() {
        return equivalentAmount;
    }

    public void setEquivalentAmount(double equivalentAmount) {
        this.equivalentAmount = equivalentAmount;
    }

    public Card getToCard() {
        for (Card card : cards) {
            if (card.getCardId() == toCardId) {
                return card;
            }
        }
        return null;
    }

    public Card getFromCard() {
        for (Card card : cards) {
         if (card.getCardId() == fromCardId) {
             return card;
         }
        }
        return null;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getFromCardId() {
        return fromCardId;
    }

    public void setFromCardId(long fromCardId) {
        this.fromCardId = fromCardId;
    }

    public long getToCardId() {
        return toCardId;
    }

    public void setToCardId(long toCardId) {
        this.toCardId = toCardId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
