package com.ebanking.ccui.service.client.impl.client.retrieve;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RetrieveClientRQ;
import com.ebanking.ccui.service.response.RetrieveClientRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RetrieveClientService implements ServiceClient<RetrieveClientRQ, RetrieveClientRS> {
    @Override
    public RetrieveClientRS execute(RetrieveClientRQ request) throws EBankingException {
        RetrieveClientServiceServiceLocator locator = new RetrieveClientServiceServiceLocator();
        try {
            RetrieveClientService_PortType service = locator.getRetrieveClientService();
            RetrieveClientRS retrieveClientRS = service.execute(request);
            return retrieveClientRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
