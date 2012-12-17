package com.ebanking.ccui.service.client.impl.security.login;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.LoginClientRQ;
import com.ebanking.ccui.service.response.LoginClientRS;

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
