package com.ebanking.ccui.presentation.action.client.account;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.Account;
import com.ebanking.ccui.model.card.Card;
import com.ebanking.ccui.model.card.CardAccount;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.CardAccountsForm;
import com.ebanking.ccui.presentation.form.ClientCardsInfoForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.ClientCardsRQ;
import com.ebanking.ccui.service.response.ClientCardsRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.*;

public class RetrieveCardAccountsAction extends BaseRQRSAction<ClientCardsRQ, ClientCardsRS> {
    private long id;

    public void setId(long id) {
        this.id = id;
    }

    @Autowired
    private CardAccountsForm cardAccountsForm;

    @Override
    @Autowired
    @Qualifier("clientCardsService")
    public void setServiceClient(ServiceClient<ClientCardsRQ, ClientCardsRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected ClientCardsRQ prepareRequest() {
        ClientCardsRQ clientCardsRQ = new ClientCardsRQ();
        clientCardsRQ.setClientId(id);
        return clientCardsRQ;
    }

    @Override
    protected String processResponse(ClientCardsRS responseObject) throws EBankingException {
        Card[] cards = responseObject.getCards();
        if (cards == null) {
            throw new  EBankingException("Error while processing ClientCards response for ClientCards action. Cards array is null");
        }
        List<Card> cardsList = new ArrayList<Card>(Arrays.asList(cards));

        Set<CardAccount> cardAccounts = new HashSet<CardAccount>();
        Map<CardAccount, List<Card>> cardAccountListMap = new HashMap<CardAccount, List<Card>>();

        for (Card card : cardsList) {
            cardAccounts.add(card.getCardAccount());
        }
        for (CardAccount cardAccount : cardAccounts) {
            cardAccountListMap.put(cardAccount, new ArrayList<Card>());
        }
        for (Card card : cardsList) {
            cardAccountListMap.get(card.getCardAccount()).add(card);
        }
        Set<CardAccount> keys = cardAccountListMap.keySet();
        for (CardAccount cardAccount : keys) {
            Card[] cardsArray = cardAccountListMap.get(cardAccount).
                    toArray(new Card[cardAccountListMap.get(cardAccount).size()]);
            cardAccount.setCards(cardsArray);
        }
        cardAccountsForm.setCardAccounts(cardAccountListMap.keySet());
        cardAccountsForm.setDate(new Date());
        HttpSessionUtil.setCardAccountsForm(cardAccountsForm);

        return "success";
    }
}
