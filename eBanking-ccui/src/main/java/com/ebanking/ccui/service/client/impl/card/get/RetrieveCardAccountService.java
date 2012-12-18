package com.ebanking.ccui.service.client.impl.card.get;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveCardAccountRQ;
import com.ebanking.ccui.service.response.RetrieveCardAccountRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RetrieveCardAccountService implements ServiceClient<RetrieveCardAccountRQ, RetrieveCardAccountRS> {
    @Override
    public RetrieveCardAccountRS execute(RetrieveCardAccountRQ request) throws EBankingException {
        RetrieveCardAccountServiceServiceLocator locator = new RetrieveCardAccountServiceServiceLocator();
        try {
            RetrieveCardAccountService_PortType service = locator.getRetrieveCardAccountService();
            RetrieveCardAccountRS retrieveCardAccountRS = service.execute(request);
            return retrieveCardAccountRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
