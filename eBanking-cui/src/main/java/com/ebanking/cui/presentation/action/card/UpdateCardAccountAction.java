package com.ebanking.cui.presentation.action.card;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.CardAccountRQ;
import com.ebanking.cui.service.response.CardAccountRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class UpdateCardAccountAction extends BaseRQRSAction<CardAccountRQ, CardAccountRS> {

    @Override
    @Autowired
    @Qualifier("cardAccountService")
    public void setServiceClient(ServiceClient<CardAccountRQ, CardAccountRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected CardAccountRQ prepareRequest() {
        CardAccountRQ cardAccountRQ = new CardAccountRQ();
        Long clientId = HttpSessionUtil.getClientAccount().getClient().getClientId();
        cardAccountRQ.setClientId(clientId);
        return cardAccountRQ;
    }

    @Override
    protected String processResponse(CardAccountRS responseObject) {
        System.out.print(responseObject);
        return "success";
    }
}
