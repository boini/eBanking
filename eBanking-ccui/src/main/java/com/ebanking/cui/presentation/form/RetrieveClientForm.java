package com.ebanking.cui.presentation.form;

import com.ebanking.cui.model.account.Client;

import java.util.List;

public class RetrieveClientForm {
    private Client[] clients;
    private boolean success;
    private String exception;

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

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
}
