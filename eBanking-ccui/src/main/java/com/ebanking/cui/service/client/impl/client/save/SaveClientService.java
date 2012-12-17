package com.ebanking.cui.service.client.impl.client.save;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.SaveClientRQ;
import com.ebanking.cui.service.response.SaveClientRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class SaveClientService implements ServiceClient<SaveClientRQ, SaveClientRS> {
    @Override
    public SaveClientRS execute(SaveClientRQ request) throws EBankingException {
        SaveClientServiceServiceLocator locator = new SaveClientServiceServiceLocator();
        try {
            SaveClientService_PortType service = locator.getSaveClientService();
            SaveClientRS saveClientRS = service.execute(request);
            return saveClientRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
