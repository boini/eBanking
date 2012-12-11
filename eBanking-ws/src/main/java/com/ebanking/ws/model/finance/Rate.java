package com.ebanking.ws.model.finance;

import javax.persistence.*;

@Table(name = "RATE")
@Entity
public class Rate {
    @Id
    @Column(name = "RATE_ID")
    private long rateId;
    @ManyToOne
    @JoinColumn(name = "CURRENCY_ID")
    private Currency currency;
    @Column(name = "PURCHASE")
    private double purchase;
    @Column(name = "SALE")
    private double sale;

    public long getRateId() {
        return rateId;
    }

    public void setRateId(long rateId) {
        this.rateId = rateId;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
