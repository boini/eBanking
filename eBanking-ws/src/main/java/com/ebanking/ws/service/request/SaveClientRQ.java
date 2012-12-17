package com.ebanking.ws.service.request;

import com.ebanking.ws.model.account.Client;

public class SaveClientRQ {
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "SaveClientRQ{" +
                "client=" + client +
                '}';
    }
}
