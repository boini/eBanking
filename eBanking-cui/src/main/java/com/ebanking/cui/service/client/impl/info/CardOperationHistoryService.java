package com.ebanking.cui.service.client.impl.info;

import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.CardOperationHistoryRQ;
import com.ebanking.cui.service.response.CardOperationHistoryRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class CardOperationHistoryService implements ServiceClient<CardOperationHistoryRQ, CardOperationHistoryRS> {



    @Override
    public CardOperationHistoryRS execute(CardOperationHistoryRQ request) {
        CardOperationHistoryServiceServiceLocator locator = new CardOperationHistoryServiceServiceLocator();
        try {
            CardOperationHistoryService_PortType service = locator.getCardOperationHistoryService();
            CardOperationHistoryRS cardOperationHistoryRS = service.execute(request);
            return cardOperationHistoryRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
