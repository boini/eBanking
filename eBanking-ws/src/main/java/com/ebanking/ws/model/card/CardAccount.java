package com.ebanking.ws.model.card;

import com.ebanking.ws.model.finance.Amount;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class CardAccount {
    private long cardAccountId;
    private Set cards;
    private Amount balance;

    public long getCardAccountId() {
        return cardAccountId;
    }

    public void setCardAccountId(long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }

    public Amount getBalance() {
        return balance;
    }

    public void setBalance(Amount balance) {
        this.balance = balance;
    }

    public Set getCards() {
        return cards;
    }

    public void setCards(Set cards) {
        this.cards = cards;
    }
}
