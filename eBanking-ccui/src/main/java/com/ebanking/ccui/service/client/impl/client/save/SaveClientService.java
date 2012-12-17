package com.ebanking.ccui.service.client.impl.client.save;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.SaveClientRQ;
import com.ebanking.ccui.service.response.SaveClientRS;

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
