package com.ebanking.ws.service.impl.security;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.LoginClientRQ;
import com.ebanking.ws.service.response.LoginClientRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class UserLoginService extends SpringSupportService implements Service<LoginClientRQ, LoginClientRS> {

    private AccountDAO accountDAO;

    @Override
    @WebMethod
    public LoginClientRS execute(LoginClientRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        /*logger.logRQRS(request, UserLoginService.class);*/

        accountDAO = (AccountDAO) getBean("accountDAO");

        String login = request.getLogin();
        String password = request.getPassword();

        LoginClientRS loginClientRS = new LoginClientRS();

        Account account = accountDAO.getByLogin(login);
        if (account.getPassword().equals(password)) {
            loginClientRS.setAccount(account);
        }

        /*logger.logRQRS(loginClientRS, UserLoginService.class);*/

        return loginClientRS;
    }
}
