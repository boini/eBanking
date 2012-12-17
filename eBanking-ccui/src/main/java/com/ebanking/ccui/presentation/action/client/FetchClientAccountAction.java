package com.ebanking.ccui.presentation.action.client;

import com.ebanking.ccui.model.account.Account;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.ClientInfoForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.FetchAccountRQ;
import com.ebanking.ccui.service.response.FetchAccountRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchClientAccountAction extends BaseRQRSAction<FetchAccountRQ, FetchAccountRS> {

    @Autowired
    private ClientInfoForm clientInfoForm;

    @Override
    @Autowired
    @Qualifier("fetchClientAccountService")
    public void setServiceClient(ServiceClient<FetchAccountRQ, FetchAccountRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected FetchAccountRQ prepareRequest() {
        FetchAccountRQ fetchAccountRQ = new FetchAccountRQ();
        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        fetchAccountRQ.setLogin(principal.getLogin());
        fetchAccountRQ.setPassword(principal.getPassword());
        return fetchAccountRQ;
    }

    @Override
    protected String processResponse(FetchAccountRS responseObject) {
        Account account = responseObject.getAccount();
        HttpSessionUtil.setClientAccount(account);

        clientInfoForm.setFirstname(account.getClient().getFirstname());
        clientInfoForm.setMiddlename(account.getClient().getMiddlename());
        clientInfoForm.setLastname(account.getClient().getLastname());
        HttpSessionUtil.setClientInfoForm(clientInfoForm);

        return "success";
    }
}
