package com.ebanking.ccui.service.client.impl.log;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.AppLogRQ;
import com.ebanking.ccui.service.response.AppLogRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class AppLogService implements ServiceClient<AppLogRQ, AppLogRS> {
    @Override
    public AppLogRS execute(AppLogRQ request) throws EBankingException {
        AppLogServiceServiceLocator locator = new AppLogServiceServiceLocator();
        try {
            AppLogService_PortType service = locator.getAppLogService();
            AppLogRS appLogRS = service.execute(request);
            return appLogRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
