package com.ebanking.ws.model.card;

import com.ebanking.ws.model.finance.Amount;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "CARD_ACCOUNT")
public class CardAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ACCOUNT_ID")
    private long cardAccountId;
/*
    private Set cards;

    private Amount balance;*/

    public long getCardAccountId() {
        return cardAccountId;
    }

    public void setCardAccountId(long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }
/*
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
    }*/
}
