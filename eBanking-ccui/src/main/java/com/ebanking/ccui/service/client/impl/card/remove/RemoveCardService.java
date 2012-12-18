package com.ebanking.ccui.service.client.impl.card.remove;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RemoveCardRQ;
import com.ebanking.ccui.service.response.RemoveCardRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RemoveCardService implements ServiceClient<RemoveCardRQ, RemoveCardRS> {
    @Override
    public RemoveCardRS execute(RemoveCardRQ request) throws EBankingException {
        RemoveCardServiceServiceLocator locator = new RemoveCardServiceServiceLocator();
        try {
            RemoveCardService_PortType service = locator.getRemoveCardService();
            RemoveCardRS removeCardRS = service.execute(request);
            return removeCardRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
