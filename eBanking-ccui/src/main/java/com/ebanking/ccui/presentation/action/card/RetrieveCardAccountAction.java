package com.ebanking.ccui.presentation.action.card;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.card.CardAccount;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.CardAccountsForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveCardAccountRQ;
import com.ebanking.ccui.service.response.RetrieveCardAccountRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.HashSet;
import java.util.Set;

public class RetrieveCardAccountAction extends BaseRQRSAction<RetrieveCardAccountRQ, RetrieveCardAccountRS> {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Autowired
    private CardAccountsForm cardAccountsForm;

    @Override
    @Autowired
    @Qualifier(value = "retrieveCardAccountService")
    public void setServiceClient(ServiceClient<RetrieveCardAccountRQ, RetrieveCardAccountRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected RetrieveCardAccountRQ prepareRequest() throws EBankingException {
        RetrieveCardAccountRQ retrieveCardAccountRQ = new RetrieveCardAccountRQ();
        retrieveCardAccountRQ.setClientId(id);
        return retrieveCardAccountRQ;
    }

    @Override
    protected String processResponse(RetrieveCardAccountRS responseObject) throws EBankingException {
        CardAccount[] cardAccounts = responseObject.getCardAccounts();

        Set<CardAccount> cardAccountSet = new HashSet<CardAccount>();
        for (CardAccount cardAccount : cardAccounts) {
            cardAccountSet.add(cardAccount);
        }

        cardAccountsForm.setCardAccounts(cardAccountSet);
        cardAccountsForm.setClientId(id);
        return "success";
    }
}
