package com.ebanking.cui.presentation.action.client;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/30/12
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClientCardsAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS> {

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ClientCardsRQ prepareRequest() {
        ClientCardsRQ clientCardsRQ = new ClientCardsRQ();
        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        clientCardsRQ.setClientId(principal.getClient().getClientId());
        return clientCardsRQ;
    }

    @Override
    protected String processResponse(ClientCardsRS responseObject) {
        System.out.println(responseObject);
        return "success";
    }
}
