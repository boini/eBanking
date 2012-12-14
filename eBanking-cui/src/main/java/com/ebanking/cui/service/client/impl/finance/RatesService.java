package com.ebanking.cui.service.client.impl.finance;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.RatesRQ;
import com.ebanking.cui.service.response.RatesRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class RatesService implements ServiceClient<RatesRQ, RatesRS> {
    @Override
    public RatesRS execute(RatesRQ request) throws EBankingException {
        RatesServiceServiceLocator locator = new RatesServiceServiceLocator();
        try {
            RatesService_PortType service = locator.getRatesService();
            RatesRS ratesRS = service.execute(request);
            return ratesRS;
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            throw new EBankingException("Exception while executing Rates service", e.getMessage());
        }
    }
}
