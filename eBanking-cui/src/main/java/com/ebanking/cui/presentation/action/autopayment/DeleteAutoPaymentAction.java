package com.ebanking.cui.presentation.action.autopayment;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.SaveAutoPaymentRQ;
import com.ebanking.cui.service.response.SaveAutoPaymentRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class DeleteAutoPaymentAction extends BaseRQRSAction<SaveAutoPaymentRQ, SaveAutoPaymentRS> {
    private long id;

    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    @Autowired
    @Qualifier(value = "saveAutoPaymentService")
    public void setServiceClient(ServiceClient<SaveAutoPaymentRQ, SaveAutoPaymentRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected SaveAutoPaymentRQ prepareRequest() throws EBankingException {
        SaveAutoPaymentRQ saveAutoPaymentRQ = new SaveAutoPaymentRQ();
        saveAutoPaymentRQ.setPeriod("R");
        saveAutoPaymentRQ.setAutoPayment(HttpSessionUtil.getAutoPaymentForm().getById(id));
        return saveAutoPaymentRQ;
    }

    @Override
    protected String processResponse(SaveAutoPaymentRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
