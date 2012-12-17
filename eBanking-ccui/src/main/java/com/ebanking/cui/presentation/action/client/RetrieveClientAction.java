package com.ebanking.cui.presentation.action.client;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.RetrieveClientForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.RetrieveClientRQ;
import com.ebanking.cui.service.response.RetrieveClientRS;
import com.ebanking.cui.session.HttpSessionUtil;
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
