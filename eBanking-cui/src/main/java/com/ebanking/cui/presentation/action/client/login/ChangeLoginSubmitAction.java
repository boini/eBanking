package com.ebanking.cui.presentation.action.client.login;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 10.12.12
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
public class ChangeLoginSubmitAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS/*ChangeLoginRQ, ChangeLoginRS*/> {

    private String oldLogin;
    private String newLogin;

    public void setOldLogin(String oldLogin) {
        this.oldLogin = oldLogin;
    }

    public void setNewLogin(String newLogin) {
        this.newLogin = newLogin;
    }

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ClientCardsRQ/*ChangeLoginRQ*/ prepareRequest() {
        //TODO: implement
//        ChangeLoginRQ request = new ChangeLoginRQ();
        ClientCardsRQ request = new ClientCardsRQ();
        return request;
    }

    @Override
    protected String processResponse(ClientCardsRS/*ChangeLoginRS*/ responseObject) {
        //TODO: implement
        return "success";
    }
}
