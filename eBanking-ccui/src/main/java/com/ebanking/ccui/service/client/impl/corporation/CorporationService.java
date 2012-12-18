package com.ebanking.ccui.service.client.impl.corporation;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.CorporationRQ;
import com.ebanking.ccui.service.response.CorporationRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class CorporationService implements ServiceClient<CorporationRQ, CorporationRS> {
    @Override
    public CorporationRS execute(CorporationRQ request) throws EBankingException {
        CorporationServiceServiceLocator locator = new CorporationServiceServiceLocator();
        try {
            CorporationService_PortType service = locator.getCorporationService();
            CorporationRS corporationRS = service.execute(request);
            return corporationRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
