package com.ebanking.ccui.service.client.impl.rate;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.SaveRateRQ;
import com.ebanking.ccui.service.response.SaveRateRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class SaveRateService implements ServiceClient<SaveRateRQ, SaveRateRS> {
    @Override
    public SaveRateRS execute(SaveRateRQ request) throws EBankingException {
        SaveRateServiceServiceLocator locator = new SaveRateServiceServiceLocator();
        try {
            SaveRateService_PortType service = locator.getSaveRateService();
            SaveRateRS saveRateRS = service.execute(request);
            return saveRateRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
