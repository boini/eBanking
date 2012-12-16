package com.ebanking.cui.presentation.action.client.password;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ChangePasswordRQ;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ChangePasswordRS;
import com.ebanking.cui.service.response.ClientCardsRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.context.SecurityContextHolder;

public class ChangePasswordSubmitAction extends BaseRQRSAction<ChangePasswordRQ, ChangePasswordRS> {

    private String currentPassword;
    private String newPassword;
    private String confirmPassword;
    private boolean success;
    private boolean call;
    private String exception;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private PasswordEncoder passwordEncoder;

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getException() {
        return exception;
    }

    public void setCall(boolean call) {
        this.call = call;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    @Autowired
    @Qualifier(value = "changePasswordService")
    public void setServiceClient(ServiceClient<ChangePasswordRQ, ChangePasswordRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ChangePasswordRQ prepareRequest() throws EBankingException {
        ChangePasswordRQ changePasswordRQ = new ChangePasswordRQ();
        changePasswordRQ.setCurrentPassword(passwordEncoder.encodePassword(currentPassword, "12345"));
        changePasswordRQ.setNewPassword(passwordEncoder.encodePassword(newPassword, "12345"));
        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        changePasswordRQ.setLogin(principal.getLogin());
        return changePasswordRQ;
    }

    @Override
    protected String processResponse(ChangePasswordRS responseObject) throws EBankingException {
        if (call) {
            success = responseObject.isSuccess();
            exception = responseObject.getException();
            call = false;
            if (success) {
                Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
                principal.setPassword(passwordEncoder.encodePassword(newPassword, "12345"));
            }
        }
        return "success";
    }
}
