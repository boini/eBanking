package com.ebanking.ccui.presentation.action.client.edit;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.Client;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.SaveClientRQ;
import com.ebanking.ccui.service.response.SaveClientRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SaveClientAction extends BaseRQRSAction<SaveClientRQ, SaveClientRS> {
    private String firstname;
    private String middlename;
    private String lastname;
    private String dateOfBirth;
    private String secretWord;
    private String personalCode;

    @Override
    @Autowired
    @Qualifier(value = "saveClientService")
    public void setServiceClient(ServiceClient<SaveClientRQ, SaveClientRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected SaveClientRQ prepareRequest() throws EBankingException {
        SaveClientRQ saveClientRQ = new SaveClientRQ();
        Client client = HttpSessionUtil.getEditClientForm().getClient();
        try {
            populate(client);
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        saveClientRQ.setClient(client);
        return saveClientRQ;
    }

    @Override
    protected String processResponse(SaveClientRS responseObject) throws EBankingException {
        return "success";
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    private void populate(Client client) throws ParseException {
        DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(formatter.parse(dateOfBirth));
        client.setDateOfBirth(calendar);
        client.setFirstname(firstname);
        client.setMiddlename(middlename);
        client.setLastname(lastname);
        client.setPersonalCode(personalCode);
        client.setSecretWord(secretWord);
    }
}
