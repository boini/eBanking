package com.ebanking.ws.service.impl.removeCard;

public enum RemoveCardType {
    CARD("card"),
    CARD_ACCOUNT("cardAccount"),
    CLIENT("client");

    private String type;

    private RemoveCardType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static RemoveCardType getRemoveCardType(String type) {
        if (CARD.getType().equals(type)) {
            return CARD;
        }
        if (CARD_ACCOUNT.getType().equals(type)) {
            return CARD_ACCOUNT;
        }
        if (CLIENT.getType().equals(type)) {
            return CLIENT;
        }
        return null;
    }
}
