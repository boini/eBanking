package com.ebanking.ws.service.security;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.LoginClientRQ;
import com.ebanking.ws.service.response.LoginClientRS;
import org.apache.axis.transport.http.AxisServlet;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.remoting.jaxrpc.ServletEndpointSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.rpc.server.ServletEndpointContext;

@WebService
public class UserLoginService extends SpringSupportService implements Service<LoginClientRQ, LoginClientRS> {

    private AccountDAO accountDAO;

    @Override
    @WebMethod
    public LoginClientRS execute(LoginClientRQ request) {

        accountDAO = (AccountDAO) getBean("accountDAO");

        String login = request.getLogin();
        Account account = accountDAO.getByLogin(login);

        LoginClientRS loginClientRS = new LoginClientRS();
        loginClientRS.setAccount(account);
        loginClientRS.setLogin(login);

        return loginClientRS;
    }
}
