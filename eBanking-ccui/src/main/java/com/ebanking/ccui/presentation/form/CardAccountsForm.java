package com.ebanking.ccui.presentation.form;

import com.ebanking.ccui.model.card.CardAccount;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class CardAccountsForm {
    private Set<CardAccount> cardAccounts;
    private Date date;

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
