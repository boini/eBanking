package com.ebanking.ws.model.account;

import com.ebanking.ws.model.finance.Currency;

import javax.persistence.*;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:28 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "BANK_ACCOUNT")
public class BankAccount {
    @Id
    @Column(name = "BANK_ACCOUNT_ID")
    @GeneratedValue
    private long bankAccountId;
    @ManyToOne
    @JoinColumn(name = "CORPORATION_ID")
    private Corporation corporation;
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "CURRENCY_ID")
    private Currency currency;
    @Column(name = "AMOUNT")
    private double amount;

    public long getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public Corporation getCorporation() {
        return corporation;
    }

    public void setCorporation(Corporation corporation) {
        this.corporation = corporation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
