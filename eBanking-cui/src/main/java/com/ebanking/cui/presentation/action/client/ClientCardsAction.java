package com.ebanking.cui.presentation.action.client;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.card.Card;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.ClientCardsInfoForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class ClientCardsAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS> {

    @Autowired
    private ClientCardsInfoForm clientCardsInfoForm;

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
        Card[] cards = responseObject.getCards();
        List<Card> cardsList = new ArrayList<Card>(Arrays.asList(cards));
        clientCardsInfoForm.setCards(cardsList);
        clientCardsInfoForm.setDate(new Date());
        HttpSessionUtil.setClientCardsForm(clientCardsInfoForm);
        return "success";
    }
}
