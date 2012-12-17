package com.ebanking.ccui.exception;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 14.12.12
 * Time: 0:45
 * To change this template use File | Settings | File Templates.
 */
public class EBankingException extends Exception {

    private static final String DEFAULT_MSG = "Unknown eBanking exception";

    private String originalMessage; //real cause of the exception

    public EBankingException() {
        super(DEFAULT_MSG);
    }

    public EBankingException(String msg) {
        super(msg);
    }

    public EBankingException(String msg, String originalMessage) {
        super(msg);
        this.originalMessage = originalMessage;
    }

    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }

    public String getOriginalMessage() {
        return this.originalMessage;
    }

}
