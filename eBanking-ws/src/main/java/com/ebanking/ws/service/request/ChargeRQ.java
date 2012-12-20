package com.ebanking.ws.service.request;

import java.util.Date;

public class ChargeRQ {
    private long fromBankAccount;
    private long toCardAccount;
    private double amount;
    private Date date;

    public long getFromBankAccount() {
        return fromBankAccount;
    }

    public void setFromBankAccount(long fromBankAccount) {
        this.fromBankAccount = fromBankAccount;
    }

    public long getToCardAccount() {
        return toCardAccount;
    }

    public void setToCardAccount(long toCardAccount) {
        this.toCardAccount = toCardAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
