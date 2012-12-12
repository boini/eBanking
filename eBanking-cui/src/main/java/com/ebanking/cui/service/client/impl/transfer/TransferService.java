package com.ebanking.cui.service.client.impl.transfer;

import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.TransferRQ;
import com.ebanking.cui.service.response.TransferRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/13/12
 * Time: 12:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransferService implements ServiceClient<TransferRQ, TransferRS> {
    @Override
    public TransferRS execute(TransferRQ request) {
        TransferServiceServiceLocator locator = new TransferServiceServiceLocator();
        try {
            TransferService_PortType service = locator.getTransferService();
            TransferRS transferRS = service.execute(request);
            return transferRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
