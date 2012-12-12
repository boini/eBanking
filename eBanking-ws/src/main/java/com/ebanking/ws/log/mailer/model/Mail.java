package com.ebanking.ws.log.mailer.model;

/**
 * @author: AS
 */
public class Mail {

    private String action;
    private double amount;
    private String userName;

    public Mail() {
    }

    public Mail(String action, double amount, String userName) {
        this.action = action;
        this.amount = amount;
        this.userName = userName;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
