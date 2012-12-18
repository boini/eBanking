package com.ebanking.ccui.service.client.impl.account;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveAccountRQ;
import com.ebanking.ccui.service.response.RetrieveAccountRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RetrieveAccountService implements ServiceClient<RetrieveAccountRQ, RetrieveAccountRS> {
    @Override
    public RetrieveAccountRS execute(RetrieveAccountRQ request) throws EBankingException {
        RetrieveAccountServiceServiceLocator locator = new RetrieveAccountServiceServiceLocator();
        try {
            RetrieveAccountService_PortType service = locator.getRetrieveAccountService();
            RetrieveAccountRS retrieveAccountRS = service.execute(request);
            return retrieveAccountRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
