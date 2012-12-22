package com.ebanking.ccui.presentation.action.search;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.RetrieveClientForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveClientRQ;
import com.ebanking.ccui.service.response.RetrieveClientRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ClientSearchAction extends BaseRQRSAction<RetrieveClientRQ, RetrieveClientRS> {
    private String fn;
    private String ln;
    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

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
        retrieveClientRQ.setType("search");
        if (fn.trim().length() == 0) {
            fn = null;
        }
        if (ln.trim().length() == 0) {
            ln = null;
        }
        retrieveClientRQ.setSearchField(fn);
        retrieveClientRQ.setSearchKey(ln);
        return retrieveClientRQ;
    }

    @Override
    protected String processResponse(RetrieveClientRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();

        if (success) {
            retrieveClientForm.setClients(responseObject.getClients());
            HttpSessionUtil.setRetrieveClientForm(retrieveClientForm);
        }

        return "success";
    }
}
