package com.ebanking.cui.service.client.impl.saveAutopayment;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.SaveAutoPaymentRQ;
import com.ebanking.cui.service.response.SaveAutoPaymentRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class SaveAutoPaymentService implements ServiceClient<SaveAutoPaymentRQ, SaveAutoPaymentRS> {
    @Override
    public SaveAutoPaymentRS execute(SaveAutoPaymentRQ request) throws EBankingException {
        SaveAutoPaymentServiceServiceLocator locator = new SaveAutoPaymentServiceServiceLocator();
        try {
            SaveAutoPaymentService_PortType service = locator.getSaveAutoPaymentService();
            SaveAutoPaymentRS saveAutoPaymentRS = service.execute(request);
            return saveAutoPaymentRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
