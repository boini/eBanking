package com.ebanking.ws.service.response;

import com.ebanking.ws.model.card.CardAccount;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchCardAccountByIdRS {
    private CardAccount cardAccount;

    public CardAccount getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(CardAccount cardAccount) {
        this.cardAccount = cardAccount;
    }
}
