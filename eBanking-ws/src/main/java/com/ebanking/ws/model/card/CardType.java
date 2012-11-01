package com.ebanking.ws.model.card;

import javax.persistence.*;

@Entity
@Table(name = "CARD_TYPE")
public class CardType {
    @Id
    @GeneratedValue
    @Column(name = "CARD_TYPE_ID")
    private long cardTypeId;
    @Column(name = "CARD_TYPE_NAME")
    private String cardTypeName;
    @Column(name = "DESCRIPTION")
    private String description;

    public long getCardTypeId() {
        return cardTypeId;
    }

    public void setCardTypeId(long cardTypeId) {
        this.cardTypeId = cardTypeId;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
