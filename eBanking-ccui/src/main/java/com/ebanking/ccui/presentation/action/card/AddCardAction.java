package com.ebanking.ccui.presentation.action.card;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.AddCardRQ;
import com.ebanking.ccui.service.response.AddCardRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class AddCardAction extends BaseRQRSAction<AddCardRQ, AddCardRS> {
    private String cardNumber;
    private String cvv;
    private String cardType;
    private double creditLimit;
    private String expDate;
    private long cardAccountId;

    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setCardAccountId(long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }

    @Override
    @Autowired
    @Qualifier(value = "addCardService")
    public void setServiceClient(ServiceClient<AddCardRQ, AddCardRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected AddCardRQ prepareRequest() throws EBankingException {
        AddCardRQ addCardRQ = new AddCardRQ();
        addCardRQ.setCardAccountId(cardAccountId);
        addCardRQ.setCardNumber(cardNumber);
        addCardRQ.setCardType(cardType);
        addCardRQ.setCreditLimit(creditLimit);
        addCardRQ.setCvv(cvv);

        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(formatter.parse(expDate));
        } catch (ParseException e) {
            throw new EBankingException(e.getMessage());
        }
        addCardRQ.setExpirationDate(calendar);

        return addCardRQ;
    }

    @Override
    protected String processResponse(AddCardRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
