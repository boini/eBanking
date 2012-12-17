package com.ebanking.cui.presentation.action.client.edit;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.EditClientForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.RetrieveClientRQ;
import com.ebanking.cui.service.response.RetrieveClientRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class EditClientAction extends BaseRQRSAction<RetrieveClientRQ, RetrieveClientRS> {
    private long id;
    private EditClientForm editClientForm;

    @Autowired
    public void setEditClientForm(EditClientForm editClientForm) {
        this.editClientForm = editClientForm;
    }

    public void setId(long id) {
        this.id = id;
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
        retrieveClientRQ.setClientId(id);
        retrieveClientRQ.setType("id");

        return retrieveClientRQ;
    }

    @Override
    protected String processResponse(RetrieveClientRS responseObject) throws EBankingException {
        editClientForm.setClient(responseObject.getClients()[0]);

        HttpSessionUtil.setEditClientForm(editClientForm);

        return "success";
    }
}
