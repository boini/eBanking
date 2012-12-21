package com.ebanking.ws.service.request;

import com.ebanking.ws.model.operation.AutoPayment;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class SaveAutoPaymentRQ {
    private AutoPayment autoPayment;
    private long operationId;
    private String period;

    public AutoPayment getAutoPayment() {
        return autoPayment;
    }

    public void setAutoPayment(AutoPayment autoPayment) {
        this.autoPayment = autoPayment;
    }

    public long getOperationId() {
        return operationId;
    }

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
}
