package com.ebanking.ws.service.response;

import com.ebanking.ws.model.card.CardAccount;

public class RetrieveCardAccountRS {
    private CardAccount[] cardAccounts;
    private boolean success;
    private String exception;

    public CardAccount[] getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(CardAccount[] cardAccounts) {
        this.cardAccounts = cardAccounts;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
