package com.ebanking.ws.model.card;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class CardType {
    private long cardTypeId;
    private String cardTypeName;
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
