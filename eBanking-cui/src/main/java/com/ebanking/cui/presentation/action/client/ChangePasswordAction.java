package com.ebanking.cui.presentation.action.client;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ChangePasswordRQ;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ChangePasswordRS;
import com.ebanking.cui.service.response.ClientCardsRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 09.12.12
 * Time: 13:37
 * To change this template use File | Settings | File Templates.
 */
public class ChangePasswordAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS/*ChangePasswordRQ, ChangePasswordRS*/> {

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS/*ChangePasswordRQ, ChangePasswordRS*/> serviceClient) {
        this.serviceClient =  serviceClient;
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
