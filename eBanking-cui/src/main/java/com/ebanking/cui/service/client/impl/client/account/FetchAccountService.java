package com.ebanking.cui.service.client.impl.client.account;

import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.client.impl.security.login.UserLoginServiceServiceLocator;
import com.ebanking.cui.service.client.impl.security.login.UserLoginService_PortType;
import com.ebanking.cui.service.request.FetchAccountRQ;
import com.ebanking.cui.service.response.FetchAccountRS;
import com.ebanking.cui.service.response.LoginClientRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchAccountService implements ServiceClient<FetchAccountRQ, FetchAccountRS> {

    @Override
    public FetchAccountRS execute(FetchAccountRQ request) {
        FetchClientAccountServiceLocator locator = new FetchClientAccountServiceLocator();
        try {
            FetchClientAccount_PortType service = locator.getFetchClientAccount();
            FetchAccountRS fetchAccountRS = (FetchAccountRS) service.execute(request);
            return fetchAccountRS;
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return new FetchAccountRS();
    }
}
