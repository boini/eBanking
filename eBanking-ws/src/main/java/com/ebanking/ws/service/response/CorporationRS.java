package com.ebanking.ws.service.response;

import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.account.Corporation;

public class CorporationRS {
    private boolean success;
    private String exception;
    private Corporation[] corporations;
    private BankAccount[] bankAccounts;

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

    public Corporation[] getCorporations() {
        return corporations;
    }

    public void setCorporations(Corporation[] corporations) {
        this.corporations = corporations;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
