package com.ebanking.ws.service.impl.login;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.ChangeLoginRQ;
import com.ebanking.ws.service.response.ChangeLoginRS;

public class ChangeLoginService extends SpringSupportService implements Service<ChangeLoginRQ, ChangeLoginRS> {
    private AccountDAO accountDAO;

    @Override
    public ChangeLoginRS execute(ChangeLoginRQ request) {
        accountDAO = (AccountDAO) getBean("accountDAO");

        String currentLogin = request.getCurrentLogin();
        String newLogin = request.getNewLogin();
        String password = request.getPassword();

        ChangeLoginRS changeLoginRS = new ChangeLoginRS();

        Account account = accountDAO.getByLogin(currentLogin);
        if (account == null || !account.getPassword().equals(password)) {
            changeLoginRS.setSuccess(false);
            changeLoginRS.setException("Incorrect login or password");
            return changeLoginRS;
        }

        Account checkAccount = accountDAO.getByLogin(newLogin);
        if (checkAccount != null) {
            changeLoginRS.setSuccess(false);
            changeLoginRS.setException("Such login is already exist");
            return changeLoginRS;
        }

        account.setLogin(newLogin);
        accountDAO.saveOrUpdate(account);
        changeLoginRS.setSuccess(true);
        return changeLoginRS;
    }
}
