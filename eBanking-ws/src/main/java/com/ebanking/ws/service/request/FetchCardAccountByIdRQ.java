package com.ebanking.ws.service.request;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchCardAccountByIdRQ {
    private Long cardAccountId;

    public Long getCardAccountId() {
        return cardAccountId;
    }

    public void setCardAccountId(Long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }
}
