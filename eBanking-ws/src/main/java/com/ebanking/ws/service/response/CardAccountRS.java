package com.ebanking.ws.service.response;

import com.ebanking.ws.model.card.CardAccount;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 6:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardAccountRS {
    private List<CardAccount> cardAccounts;

    public List<CardAccount> getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(List<CardAccount> cardAccounts) {
        this.cardAccounts = cardAccounts;
    }
}
