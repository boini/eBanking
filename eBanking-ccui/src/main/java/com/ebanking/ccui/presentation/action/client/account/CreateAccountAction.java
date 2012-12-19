package com.ebanking.ccui.presentation.action.client.account;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.CreateAccountRQ;
import com.ebanking.ccui.service.response.CreateAccountRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.encoding.PasswordEncoder;

public class CreateAccountAction extends BaseRQRSAction<CreateAccountRQ, CreateAccountRS> {
    private long clientId;
    private String login;
    private String password;

    private boolean success;
    private String exception;

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private PasswordEncoder passwordEncoder;

    @Override
    @Autowired
    @Qualifier(value = "createAccountService")
    public void setServiceClient(ServiceClient<CreateAccountRQ, CreateAccountRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected CreateAccountRQ prepareRequest() throws EBankingException {
        CreateAccountRQ createAccountRQ = new CreateAccountRQ();
        createAccountRQ.setClientId(clientId);
        createAccountRQ.setLogin(login);
        createAccountRQ.setPassword(passwordEncoder.encodePassword(password, "12345"));
        return createAccountRQ;
    }

    @Override
    protected String processResponse(CreateAccountRS responseObject) throws EBankingException {
        success = responseObject.isSuccess();
        exception = responseObject.getException();
        return "success";
    }
}
