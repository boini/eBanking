package com.ebanking.ws.service.request;

public class ChangeLoginRQ {
    private String currentLogin;
    private String newLogin;
    private String password;

    public String getCurrentLogin() {
        return currentLogin;
    }

    public void setCurrentLogin(String currentLogin) {
        this.currentLogin = currentLogin;
    }

    public String getNewLogin() {
        return newLogin;
    }

    public void setNewLogin(String newLogin) {
        this.newLogin = newLogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ChangeLoginRQ{" +
                "currentLogin='" + currentLogin + '\'' +
                ", newLogin='" + newLogin + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
