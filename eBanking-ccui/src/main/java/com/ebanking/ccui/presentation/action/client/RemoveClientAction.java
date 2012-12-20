package com.ebanking.ccui.presentation.action.client;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RemoveCardRQ;
import com.ebanking.ccui.service.response.RemoveCardRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RemoveClientAction extends BaseRQRSAction<RemoveCardRQ, RemoveCardRS> {
    private long id;
    private String type;
    private boolean success;
    private String exception;

    public void setId(long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    @Override
    @Autowired
    @Qualifier(value = "removeCardService")
    public void setServiceClient(ServiceClient<RemoveCardRQ, RemoveCardRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected RemoveCardRQ prepareRequest() throws EBankingException {
        RemoveCardRQ removeCardRQ = new RemoveCardRQ();
        removeCardRQ.setId(id);
        removeCardRQ.setType(type);
        return removeCardRQ;
    }

    @Override
    protected String processResponse(RemoveCardRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
