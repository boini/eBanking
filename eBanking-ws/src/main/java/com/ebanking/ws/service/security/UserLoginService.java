package com.ebanking.ws.service.security;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.request.LoginClientRQ;
import com.ebanking.ws.service.response.LoginClientRS;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UserLoginService implements Service<LoginClientRQ, LoginClientRS> {

    private AccountDAO accountDAO;

    @Autowired
    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    @WebMethod
    public LoginClientRS execute(LoginClientRQ request) {
        String login = request.getLogin();
        Account account = accountDAO.getByLogin(login);

        LoginClientRS loginClientRS = new LoginClientRS();
        loginClientRS.setAccount(account);
        loginClientRS.setLogin(login);

        return loginClientRS;
    }
}
