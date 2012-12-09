package com.ebanking.cui.presentation.action.payment.communications;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.card.Card;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.ClientCardsInfoForm;
import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/3/12
 * Time: 9:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class CommunicationsPaymentAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS> {

    @Autowired
    private ClientCardsInfoForm clientCardsInfoForm;
    @Autowired
    private CommunicationsPaymentForm communicationsPaymentForm;

    private String communicationsProvider;

    public String getCommunicationsProvider() {
        return communicationsProvider;
    }

    public void setCommunicationsProvider(String communicationsProvider) {
        this.communicationsProvider = communicationsProvider;
    }

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ClientCardsRQ prepareRequest() {
        communicationsPaymentForm.setProviderName(communicationsProvider);

        ClientCardsRQ clientCardsRQ = new ClientCardsRQ();
        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        clientCardsRQ.setClientId(principal.getClient().getClientId());
        return clientCardsRQ;
    }

    @Override
    protected String processResponse(ClientCardsRS responseObject) {
        Card[] cards = responseObject.getCards();
        List<Card> cardsList = new ArrayList<Card>(Arrays.asList(cards));
        communicationsPaymentForm.setCards(cardsList);
        HttpSessionUtil.setMobilePaymentForm(communicationsPaymentForm);
        return "success";
    }
}
