package com.ebanking.cui.service.client.impl.security.login;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.LoginClientRQ;
import com.ebanking.cui.service.response.LoginClientRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/27/12
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClientLoginService implements ServiceClient<LoginClientRQ, LoginClientRS> {
    @Override
    public LoginClientRS execute(LoginClientRQ request) throws EBankingException{
        UserLoginServiceServiceLocator locator = new UserLoginServiceServiceLocator();
        try {
            UserLoginService_PortType service = locator.getUserLoginService();
            LoginClientRS loginClientRS = (LoginClientRS) service.execute(request);
            return loginClientRS;
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            throw new EBankingException("Exception while executing Login request", e.getMessage());
        }
    }
}
