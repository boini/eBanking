package com.ebanking.cui.presentation.action.client.login;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ChangeLoginRQ;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ChangeLoginRS;
import com.ebanking.cui.service.response.ClientCardsRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.context.SecurityContextHolder;

public class ChangeLoginSubmitAction extends BaseRQRSAction<ChangeLoginRQ, ChangeLoginRS> {

    private String currentLogin;
    private String newLogin;
    private String password;
    private String exception;
    private boolean call;
    private boolean success;

    public void setCall(boolean call) {
        this.call = call;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private PasswordEncoder passwordEncoder;

    public String getException() {
        return exception;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setCurrentLogin(String currentLogin) {
        this.currentLogin = currentLogin;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNewLogin(String newLogin) {
        this.newLogin = newLogin;
    }

    @Override
    @Autowired
    @Qualifier("changeLoginService")
    public void setServiceClient(ServiceClient<ChangeLoginRQ, ChangeLoginRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    public String getJson() throws Exception {
        return execute();
    }

    @Override
    protected ChangeLoginRQ prepareRequest() throws EBankingException {
        ChangeLoginRQ changeLoginRQ = new ChangeLoginRQ();
        changeLoginRQ.setCurrentLogin(currentLogin);
        changeLoginRQ.setNewLogin(newLogin);
        changeLoginRQ.setPassword(passwordEncoder.encodePassword(password, "12345"));

        return changeLoginRQ;
    }

    @Override
    protected String processResponse(ChangeLoginRS responseObject) throws EBankingException {
        if (call) {
            success = responseObject.isSuccess();
            exception = responseObject.getException();
            call = false;
            if (success) {
                Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                principal.setLogin(newLogin);
            }
        }

        return "success";
    }
}
