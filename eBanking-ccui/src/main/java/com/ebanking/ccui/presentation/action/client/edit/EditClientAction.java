package com.ebanking.ccui.presentation.action.client.edit;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.EditClientForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveClientRQ;
import com.ebanking.ccui.service.response.RetrieveClientRS;
import com.ebanking.ccui.session.HttpSessionUtil;
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
