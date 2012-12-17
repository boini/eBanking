package com.ebanking.ws.log.mailer.model;

/**
 * @author: AS
 */
public class Mail {

    private String action;
    private String amount;
    private String userName;

    public Mail() {
    }

    public Mail(String action, String amount, String userName) {
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
