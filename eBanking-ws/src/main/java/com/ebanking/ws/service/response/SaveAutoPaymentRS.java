package com.ebanking.ws.service.response;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class SaveAutoPaymentRS {
    private boolean success;
    private String exception;

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
