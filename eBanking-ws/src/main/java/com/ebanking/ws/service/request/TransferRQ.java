package com.ebanking.ws.service.request;

import com.ebanking.ws.model.account.Client;

import java.util.Date;

public class TransferRQ {
    private Client client;
    private long fromCardId;
    private long toCardId;
    private double amount;
    private Date date;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TransferRQ{" +
                "client=" + client +
                ", fromCardId=" + fromCardId +
                ", toCardId=" + toCardId +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
