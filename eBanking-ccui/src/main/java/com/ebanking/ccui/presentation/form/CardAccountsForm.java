package com.ebanking.ccui.presentation.form;

import com.ebanking.ccui.model.card.CardAccount;

import java.util.Date;
import java.util.Set;

public class CardAccountsForm {
    private Set<CardAccount> cardAccounts;
    private Date date;
    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<CardAccount> getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(Set<CardAccount> cardAccounts) {
        this.cardAccounts = cardAccounts;
    }
}
