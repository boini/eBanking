package com.ebanking.cui.presentation.action.payment.electricity;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.card.Card;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.ClientCardsInfoForm;
import com.ebanking.cui.presentation.form.payments.ElectricityPaymentForm;
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
 * User: vasilii91
 * Date: 12/10/12
 * Time: 23:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElectricityPaymentAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS> {

    @Autowired
    private ClientCardsInfoForm clientCardsInfoForm;
    @Autowired
    private ElectricityPaymentForm electricityPaymentForm;

    private String provider;

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ClientCardsRQ prepareRequest() {
        electricityPaymentForm.setProviderName(provider);

        ClientCardsRQ clientCardsRQ = new ClientCardsRQ();
        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        clientCardsRQ.setClientId(principal.getClient().getClientId());
        return clientCardsRQ;
    }

    @Override
    protected String processResponse(ClientCardsRS responseObject) throws EBankingException {
        Card[] cards = responseObject.getCards();
        if (cards == null) {
            throw new EBankingException("Error while processing ClientCards response for ElectricityPayment action. Cards array is null");
        }
        List<Card> cardsList = new ArrayList<Card>(Arrays.asList(cards));
        electricityPaymentForm.setCards(cardsList);
        HttpSessionUtil.setElectricityPaymentForm(electricityPaymentForm);
        return "success";
    }
}
