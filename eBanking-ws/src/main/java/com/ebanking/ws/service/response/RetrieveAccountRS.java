package com.ebanking.ws.service.response;

import com.ebanking.ws.model.account.Account;

public class RetrieveAccountRS {
    private Account account;
    private boolean success;
    private String exception;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
