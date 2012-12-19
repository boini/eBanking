package com.ebanking.ccui.service.client.impl.createAccount;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.CreateAccountRQ;
import com.ebanking.ccui.service.response.CreateAccountRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class CreateAccountService implements ServiceClient<CreateAccountRQ, CreateAccountRS> {
    @Override
    public CreateAccountRS execute(CreateAccountRQ request) throws EBankingException {
        CreateAccountServiceServiceLocator locator = new CreateAccountServiceServiceLocator();
        try {
            CreateAccountService_PortType service = locator.getCreateAccountService();
            CreateAccountRS createAccountRS = service.execute(request);
            return createAccountRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
