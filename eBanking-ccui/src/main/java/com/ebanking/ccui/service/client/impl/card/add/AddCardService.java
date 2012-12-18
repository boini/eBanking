package com.ebanking.ccui.service.client.impl.card.add;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.AddCardRQ;
import com.ebanking.ccui.service.response.AddCardRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class AddCardService implements ServiceClient<AddCardRQ, AddCardRS> {
    @Override
    public AddCardRS execute(AddCardRQ request) throws EBankingException {
        AddCardServiceServiceLocator locator = new AddCardServiceServiceLocator();
        try {
            AddCardService_PortType service = locator.getAddCardService();
            AddCardRS addCardRS = service.execute(request);
            return addCardRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
