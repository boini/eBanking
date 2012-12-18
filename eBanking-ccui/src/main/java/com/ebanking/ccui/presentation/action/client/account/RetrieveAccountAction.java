package com.ebanking.ccui.presentation.action.client.account;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.Account;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.AccountForm;
import com.ebanking.ccui.presentation.form.CardAccountsForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveAccountRQ;
import com.ebanking.ccui.service.response.RetrieveAccountRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RetrieveAccountAction extends BaseRQRSAction<RetrieveAccountRQ, RetrieveAccountRS> {
    @Autowired
    private CardAccountsForm cardAccountsForm;
    @Autowired
    private AccountForm accountForm;

    @Override
    @Autowired
    @Qualifier(value = "retrieveAccountService")
    public void setServiceClient(ServiceClient<RetrieveAccountRQ, RetrieveAccountRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected RetrieveAccountRQ prepareRequest() throws EBankingException {
        RetrieveAccountRQ retrieveAccountRQ = new RetrieveAccountRQ();
        retrieveAccountRQ.setClientId(cardAccountsForm.getClientId());
        return retrieveAccountRQ;
    }

    @Override
    protected String processResponse(RetrieveAccountRS responseObject) throws EBankingException {
        Account account = responseObject.getAccount();
        accountForm.setAccount(account);
        HttpSessionUtil.setClientForm(accountForm);
        return "success";
    }
}
