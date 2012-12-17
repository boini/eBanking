package com.ebanking.ccui.service.client.impl.finance;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RatesRQ;
import com.ebanking.ccui.service.response.RatesRS;

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
