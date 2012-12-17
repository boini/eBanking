package com.ebanking.cui.service.client.impl.client.retrieve;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.RetrieveClientRQ;
import com.ebanking.cui.service.response.RetrieveClientRS;

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
