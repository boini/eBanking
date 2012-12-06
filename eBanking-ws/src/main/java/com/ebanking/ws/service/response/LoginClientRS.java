package com.ebanking.ws.service.response;

import com.ebanking.ws.model.account.Account;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/27/12
 * Time: 10:55 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginClientRS {
    private Account account;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "LoginClientRS{" +
                "account=" + account +
                '}';
    }
}
