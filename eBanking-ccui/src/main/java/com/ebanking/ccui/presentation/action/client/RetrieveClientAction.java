package com.ebanking.ccui.presentation.action.client;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.RetrieveClientForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveClientRQ;
import com.ebanking.ccui.service.response.RetrieveClientRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RetrieveClientAction extends BaseRQRSAction<RetrieveClientRQ, RetrieveClientRS> {

    private RetrieveClientForm retrieveClientForm;
    @Autowired
    public void setRetrieveClientForm(RetrieveClientForm retrieveClientForm) {
        this.retrieveClientForm = retrieveClientForm;
    }

    @Override
    @Autowired
    @Qualifier(value = "retrieveClientService")
    public void setServiceClient(ServiceClient<RetrieveClientRQ, RetrieveClientRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected RetrieveClientRQ prepareRequest() throws EBankingException {
        RetrieveClientRQ retrieveClientRQ = new RetrieveClientRQ();
        retrieveClientRQ.setType("all");
        return retrieveClientRQ;
    }

    @Override
    protected String processResponse(RetrieveClientRS responseObject) throws EBankingException {
        retrieveClientForm.setSuccess(responseObject.isSuccess());
        retrieveClientForm.setException(responseObject.getException());
        retrieveClientForm.setClients(responseObject.getClients());

        HttpSessionUtil.setRetrieveClientForm(retrieveClientForm);

        return "success";
    }
}
