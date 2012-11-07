package com.ebanking.cui.model.card;

import com.ebanking.cui.model.finance.Amount;

import java.util.Set;

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
