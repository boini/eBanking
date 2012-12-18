package com.ebanking.ws.service.request;

public class RemoveCardRQ {
    private long id;
    private String type;

    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
