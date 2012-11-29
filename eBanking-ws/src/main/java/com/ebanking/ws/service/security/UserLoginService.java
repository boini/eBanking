package com.ebanking.ws.service.security;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.LoginClientRQ;
import com.ebanking.ws.service.response.LoginClientRS;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UserLoginService extends SpringSupportService implements Service<LoginClientRQ, LoginClientRS> {

    private AccountDAO accountDAO;

    @Override
    @WebMethod
    public LoginClientRS execute(LoginClientRQ request) {

        accountDAO = (AccountDAO) getBean("accountDAO");

        String login = request.getLogin();
        String password = request.getPassword();

        LoginClientRS loginClientRS = new LoginClientRS();

        Account account = accountDAO.getByLogin(login);
        if (account.getPassword().equals(password)) {
            loginClientRS.setAccount(account);
        }

        return loginClientRS;
    }
}
