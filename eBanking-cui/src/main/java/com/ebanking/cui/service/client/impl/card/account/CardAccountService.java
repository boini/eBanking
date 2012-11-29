package com.ebanking.cui.service.client.impl.card.account;

import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.CardAccountRQ;
import com.ebanking.cui.service.response.CardAccountRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/27/12
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardAccountService implements ServiceClient<CardAccountRQ, CardAccountRS> {

    @Override
    public CardAccountRS execute(CardAccountRQ request) {
        CardAccountServiceServiceLocator locator = new CardAccountServiceServiceLocator();
        try {
            CardAccountService_PortType service = locator.getCardAccountService();
            CardAccountRS cardAccountRS = service.execute(request);
            return cardAccountRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
