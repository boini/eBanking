package com.ebanking.ccui.presentation.action.card;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.AddCardAccountRQ;
import com.ebanking.ccui.service.response.AddCardAccountRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CreateCardAccountAction extends BaseRQRSAction<AddCardAccountRQ, AddCardAccountRS> {
    private long clientId;
    private String number;
    private String currency;

    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setClientId(long clientId) {

        this.clientId = clientId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    @Autowired
    @Qualifier(value = "createCardAccountService")
    public void setServiceClient(ServiceClient<AddCardAccountRQ, AddCardAccountRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected AddCardAccountRQ prepareRequest() throws EBankingException {
        AddCardAccountRQ addCardAccountRQ = new AddCardAccountRQ();
        addCardAccountRQ.setClientId(clientId);
        addCardAccountRQ.setCurrency(currency);
        addCardAccountRQ.setNumber(number);
        return addCardAccountRQ;
    }

    @Override
    protected String processResponse(AddCardAccountRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
