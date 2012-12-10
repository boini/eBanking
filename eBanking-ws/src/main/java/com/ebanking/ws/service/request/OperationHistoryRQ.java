package com.ebanking.ws.service.request;

import com.ebanking.ws.service.impl.info.OperationRequestType;

import java.util.Date;

public class OperationHistoryRQ {
    private long[] idList;
    private Date fromDate;
    private Date toDate;
    private String operationRequestType;

    public long[] getIdList() {
        return idList;
    }

    public void setIdList(long[] idList) {
        this.idList = idList;
    }

    public String getOperationRequestType() {
        return operationRequestType;
    }

    public void setOperationRequestType(String operationRequestType) {
        this.operationRequestType = operationRequestType;
    }

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
}
