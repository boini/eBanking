package com.ebanking.ws.service.request;

import java.util.Date;

public class AddCardRQ {
    private long cardAccountId;
    private String cardNumber;
    private String cvv;
    private String cardType;
    private double creditLimit;
    private Date expirationDate;

    public long getCardAccountId() {
        return cardAccountId;
    }

    public void setCardAccountId(long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
