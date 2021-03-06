package com.ebanking.cui.presentation.form.payments;

import com.ebanking.cui.model.card.Card;
import com.ebanking.cui.model.payment.ProviderName;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/3/12
 * Time: 9:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class CommunicationsPaymentForm {
    protected static final String NUMBER_KEY = "Number=";

    private List<Card> cards;
    private Long cardId;
    private double amount;
    private String number;
    private Date date;
    private ProviderName.Names providerName;

    public ProviderName.Names getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerNameStr) {
        this.providerName = ProviderName.Names.valueOf(providerNameStr.toUpperCase());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

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

    public Card getActiveCard() {
        if (cardId != null) {
            for (Card card : cards) {
                if (card.getCardId() == cardId) {
                    return card;
                }
            }
        }
        return null;
    }

    public String getKey() {
        return NUMBER_KEY + number;
    }
}
