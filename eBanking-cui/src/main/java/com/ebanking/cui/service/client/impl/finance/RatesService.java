package com.ebanking.cui.service.client.impl.finance;

import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.RatesRQ;
import com.ebanking.cui.service.response.RatesRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RatesService implements ServiceClient<RatesRQ, RatesRS> {
    @Override
    public RatesRS execute(RatesRQ request) {
        RatesServiceServiceLocator locator = new RatesServiceServiceLocator();
        try {
            RatesService_PortType service = locator.getRatesService();
            RatesRS ratesRS = service.execute(request);
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
