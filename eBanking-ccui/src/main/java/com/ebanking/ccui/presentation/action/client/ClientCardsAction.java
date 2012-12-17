package com.ebanking.ccui.presentation.action.client;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.Account;
import com.ebanking.ccui.model.card.Card;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.ClientCardsInfoForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.ClientCardsRQ;
import com.ebanking.ccui.service.response.ClientCardsRS;
import com.ebanking.ccui.session.HttpSessionUtil;
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
    protected String processResponse(ClientCardsRS responseObject) throws EBankingException {
        Card[] cards = responseObject.getCards();
        if (cards == null) {
            throw new  EBankingException("Error while processing ClientCards response for ClientCards action. Cards array is null");
        }
        List<Card> cardsList = new ArrayList<Card>(Arrays.asList(cards));
        clientCardsInfoForm.setCards(cardsList);
        clientCardsInfoForm.setDate(new Date());
        HttpSessionUtil.setClientCardsForm(clientCardsInfoForm);
        return "success";
    }
}
