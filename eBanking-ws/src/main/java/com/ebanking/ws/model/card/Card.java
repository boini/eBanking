package com.ebanking.ws.model.card;

import com.ebanking.ws.model.finance.Amount;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CARD")
public class Card {

    @Id
    @GeneratedValue
    @Column(name = "CARD_ID")
    private long cardId;

    @ManyToOne
    @JoinColumn(name = "CARD_TYPE_ID")
    private CardType cardType;

    @Column(name = "EXPIRATION_DATE")
    private Date expirationDate;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "CVV")
    private String cvv;
/*
    @Type(type = "com.ebanking.ws.model.finance.AmountType")
    @Column(name = "CREDIT_LIMIT")
    private Amount creditLimit;*/

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
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

    /*public Amount getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Amount creditLimit) {
        this.creditLimit = creditLimit;
    }*/
}
