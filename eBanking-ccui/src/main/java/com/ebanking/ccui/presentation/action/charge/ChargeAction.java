package com.ebanking.ccui.presentation.action.charge;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.ChargeRQ;
import com.ebanking.ccui.service.response.ChargeRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Calendar;

public class ChargeAction extends BaseRQRSAction<ChargeRQ, ChargeRS> {
    private double amount;
    private long cardId;

    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    @Override
    @Autowired
    @Qualifier(value = "chargeService")
    public void setServiceClient(ServiceClient<ChargeRQ, ChargeRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ChargeRQ prepareRequest() throws EBankingException {
        ChargeRQ chargeRQ = new ChargeRQ();
        chargeRQ.setAmount(amount);
        chargeRQ.setDate(Calendar.getInstance());
        chargeRQ.setToCardAccount(cardId);
        return chargeRQ;
    }

    @Override
    protected String processResponse(ChargeRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
