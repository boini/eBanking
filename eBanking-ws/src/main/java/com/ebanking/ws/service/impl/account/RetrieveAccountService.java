package com.ebanking.ws.service.impl.account;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.RetrieveAccountRQ;
import com.ebanking.ws.service.response.RetrieveAccountRS;

public class RetrieveAccountService extends SpringSupportService implements Service<RetrieveAccountRQ, RetrieveAccountRS> {
    private AccountDAO accountDAO;

    @Override
    public RetrieveAccountRS execute(RetrieveAccountRQ request) {
        accountDAO = (AccountDAO) getBean("accountDAO");
        long clientId = request.getClientId();

        Account account = accountDAO.getByClientId(clientId);

        RetrieveAccountRS retrieveAccountRS = new RetrieveAccountRS();

        if (account != null) {
            retrieveAccountRS.setAccount(account);
            retrieveAccountRS.setSuccess(true);
        } else {
            retrieveAccountRS.setSuccess(false);
            retrieveAccountRS.setException("No account for such client");
        }
        return retrieveAccountRS;
    }
}
