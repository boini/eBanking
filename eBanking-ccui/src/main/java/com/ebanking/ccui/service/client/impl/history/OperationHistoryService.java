package com.ebanking.ccui.service.client.impl.history;

import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.OperationHistoryRQ;
import com.ebanking.ccui.service.response.OperationHistoryRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class OperationHistoryService implements ServiceClient<OperationHistoryRQ, OperationHistoryRS> {

    @Override
    public OperationHistoryRS execute(OperationHistoryRQ request) {
        OperationHistoryServiceServiceLocator locator = new OperationHistoryServiceServiceLocator();
        try {
            OperationHistoryService_PortType service = locator.getOperationHistoryService();
            OperationHistoryRS operationHistoryRS = service.execute(request);
            return operationHistoryRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
