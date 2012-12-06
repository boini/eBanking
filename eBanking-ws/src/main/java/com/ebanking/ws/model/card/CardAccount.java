package com.ebanking.ws.model.card;

import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.finance.Amount;
import com.ebanking.ws.model.finance.Currency;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CARD_ACCOUNT")
public class CardAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CARD_ACCOUNT_ID")
    private long cardAccountId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cardAccount", fetch = FetchType.EAGER)
    private Set<Card> cards = new HashSet<Card>();

    @Column(name = "BALANCE")
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "CURRENCY_ID")
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    public Set<Card> getCards() {
        return cards;
    }

    public void setCards(Set<Card> cards) {
        this.cards = cards;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getCardAccountId() {
        return cardAccountId;
    }

    public void setCardAccountId(long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CardAccount{" +
                "cardAccountId=" + cardAccountId +
                ", cards=" + cards +
                ", balance=" + balance +
                ", currency=" + currency +
                ", client=" + client +
                '}';
    }
}
