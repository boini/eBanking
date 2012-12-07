package com.ebanking.ws.service.request;

import java.util.Date;

public class CardOperationHistoryRQ {
    private long[] cardIdList;
    private Date fromDate;

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getFromDate() {

        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    private Date toDate;

    public long[] getCardIdList() {
        return cardIdList;
    }

    public void setCardIdList(long[] cardIdList) {
        this.cardIdList = cardIdList;
    }
}
