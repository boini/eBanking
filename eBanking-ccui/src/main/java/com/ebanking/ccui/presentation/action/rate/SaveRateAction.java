package com.ebanking.ccui.presentation.action.rate;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.SaveRateRQ;
import com.ebanking.ccui.service.response.SaveRateRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SaveRateAction extends BaseRQRSAction<SaveRateRQ, SaveRateRS> {
    private long rateId;
    private double sale;
    private double purchase;

    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setRateId(long rateId) {

        this.rateId = rateId;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    @Override
    @Autowired
    @Qualifier(value = "saveRateService")
    public void setServiceClient(ServiceClient<SaveRateRQ, SaveRateRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected SaveRateRQ prepareRequest() throws EBankingException {
        SaveRateRQ saveRateRQ = new SaveRateRQ();
        saveRateRQ.setPurchase(purchase);
        saveRateRQ.setRateId(rateId);
        saveRateRQ.setSale(sale);
        return saveRateRQ;
    }

    @Override
    protected String processResponse(SaveRateRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
