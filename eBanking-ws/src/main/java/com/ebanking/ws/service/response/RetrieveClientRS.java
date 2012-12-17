package com.ebanking.ws.service.response;

import com.ebanking.ws.model.account.Client;

public class RetrieveClientRS {
    private boolean success;
    private String exception;
    private Client[] clients;

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

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
