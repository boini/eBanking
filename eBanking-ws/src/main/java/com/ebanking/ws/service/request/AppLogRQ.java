package com.ebanking.ws.service.request;

import java.util.Date;

public class AppLogRQ {
    private Date fromDate;
    private Date toDate;
    private String actionSearch;
    private String messageSearch;

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public String getActionSearch() {
        return actionSearch;
    }

    public void setActionSearch(String actionSearch) {
        this.actionSearch = actionSearch;
    }

    public String getMessageSearch() {
        return messageSearch;
    }

    public void setMessageSearch(String messageSearch) {
        this.messageSearch = messageSearch;
    }
}

