package com.ebanking.cui.service.client.impl.login;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ChangeLoginRQ;
import com.ebanking.cui.service.response.ChangeLoginRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class ChangeLoginService implements ServiceClient<ChangeLoginRQ, ChangeLoginRS> {
    @Override
    public ChangeLoginRS execute(ChangeLoginRQ request) throws EBankingException {
        ChangeLoginServiceServiceLocator locator = new ChangeLoginServiceServiceLocator();
        try {
            ChangeLoginService_PortType service = locator.getChangeLoginService();
            ChangeLoginRS changeLoginRS = service.execute(request);
            return changeLoginRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
