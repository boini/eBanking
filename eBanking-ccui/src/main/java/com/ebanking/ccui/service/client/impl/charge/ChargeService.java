package com.ebanking.ccui.service.client.impl.charge;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.ChargeRQ;
import com.ebanking.ccui.service.response.ChargeRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class ChargeService implements ServiceClient<ChargeRQ, ChargeRS> {
    @Override
    public ChargeRS execute(ChargeRQ request) throws EBankingException {
        ChargeServiceServiceLocator locator = new ChargeServiceServiceLocator();
        try {
            ChargeService_PortType service = locator.getChargeService();
            ChargeRS chargeRS = service.execute(request);
            return chargeRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
