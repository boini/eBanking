package com.ebanking.ws.service.request;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/29/12
 * Time: 11:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientCardsRQ {
    private long clientId;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "ClientCardsRQ{" +
                "clientId=" + clientId +
                '}';
    }
}
