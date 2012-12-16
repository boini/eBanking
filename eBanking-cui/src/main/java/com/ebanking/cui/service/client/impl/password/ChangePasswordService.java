package com.ebanking.cui.service.client.impl.password;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ChangePasswordRQ;
import com.ebanking.cui.service.response.ChangePasswordRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class ChangePasswordService implements ServiceClient<ChangePasswordRQ, ChangePasswordRS> {
    @Override
    public ChangePasswordRS execute(ChangePasswordRQ request) throws EBankingException {
        ChangePasswordServiceServiceLocator locator = new ChangePasswordServiceServiceLocator();
        try {
            ChangePasswordService_PortType service = locator.getChangePasswordService();
            ChangePasswordRS changePasswordRS = service.execute(request);
            return changePasswordRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
