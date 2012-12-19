package com.ebanking.ccui.service.client.impl.cardAccount;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.AddCardAccountRQ;
import com.ebanking.ccui.service.response.AddCardAccountRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/19/12
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class CreateCardAccountService implements ServiceClient<AddCardAccountRQ, AddCardAccountRS> {
    @Override
    public AddCardAccountRS execute(AddCardAccountRQ request) throws EBankingException {
        CreateCardAccountServiceServiceLocator locator = new CreateCardAccountServiceServiceLocator();
        try {
            CreateCardAccountService_PortType service = locator.getCreateCardAccountService();
            AddCardAccountRS addCardAccountRS = service.execute(request);
            return addCardAccountRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
