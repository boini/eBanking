package com.ebanking.ws.service.impl.client;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.FetchAccountRQ;
import com.ebanking.ws.service.response.FetchAccountRS;
import com.ebanking.ws.service.response.LoginClientRS;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 9:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchClientAccount extends SpringSupportService implements Service<FetchAccountRQ, FetchAccountRS> {

    private AccountDAO accountDAO;

    @Override
    public FetchAccountRS execute(FetchAccountRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        accountDAO = (AccountDAO) getBean("accountDAO");

        logger.logRQRS(request, FetchClientAccount.class);

        String login = request.getLogin();
        String password = request.getPassword();

        FetchAccountRS fetchAccountRS = new FetchAccountRS();

        Account account = accountDAO.getByLogin(login);
        if (account.getPassword().equals(password)) {
            fetchAccountRS.setAccount(account);
        }

        logger.logRQRS(fetchAccountRS, FetchClientAccount.class);

        return fetchAccountRS;
    }
}
