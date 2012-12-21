package com.ebanking.ws.service.request;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class GetAutoPaymentRQ {
    private long operationId;

    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }
}
