package com.ebanking.ws.service.response;

import com.ebanking.ws.model.operation.AutoPayment;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class GetAutoPaymentRS {
    private AutoPayment autoPayment;
    private boolean success;
    private String exception;
    private AutoPayment[] autoPayments;

    public AutoPayment[] getAutoPayments() {
        return autoPayments;
    }

    public void setAutoPayments(AutoPayment[] autoPayments) {
        this.autoPayments = autoPayments;
    }

    public AutoPayment getAutoPayment() {
        return autoPayment;
    }

    public void setAutoPayment(AutoPayment autoPayment) {
        this.autoPayment = autoPayment;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
