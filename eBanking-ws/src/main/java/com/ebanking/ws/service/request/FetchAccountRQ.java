package com.ebanking.ws.service.request;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/27/12
 * Time: 10:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchAccountRQ {
    private String login;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "FetchAccountRQ{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
