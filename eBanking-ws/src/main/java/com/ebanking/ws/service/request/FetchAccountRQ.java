package com.ebanking.ws.service.request;

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
