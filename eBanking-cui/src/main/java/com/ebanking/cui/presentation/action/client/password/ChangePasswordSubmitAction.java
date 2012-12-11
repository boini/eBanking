package com.ebanking.cui.presentation.action.client.password;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 09.12.12
 * Time: 18:16
 * To change this template use File | Settings | File Templates.
 */
public class ChangePasswordSubmitAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS/*ChangePasswordRQ, ChangePasswordRS*/> {

    private String oldPassword;
    private String newPassword;
    private String confirmPassword;

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ClientCardsRQ/*ChangePasswordRQ*/ prepareRequest() {
        //TODO: implement
//        ChangePasswordRQ request = new ChangePasswordRQ();
        ClientCardsRQ request = new ClientCardsRQ();
        return request;
    }

    @Override
    protected String processResponse(ClientCardsRS/*ChangePasswordRS*/ responseObject) {
        //TODO: implement
        return "success";
    }
}
