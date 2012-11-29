package com.ebanking.cui.presentation.action.client;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.FetchAccountRQ;
import com.ebanking.cui.service.response.FetchAccountRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 9:44 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchClientAccountAction extends BaseRQRSAction<FetchAccountRQ, FetchAccountRS> {

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
        return "success";
    }
}
