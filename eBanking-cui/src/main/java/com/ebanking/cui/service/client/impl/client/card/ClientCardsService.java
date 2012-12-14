package com.ebanking.cui.service.client.impl.client.card;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/30/12
 * Time: 12:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClientCardsService implements ServiceClient<ClientCardsRQ, ClientCardsRS> {
    @Override
    public ClientCardsRS execute(ClientCardsRQ request) throws EBankingException {
        ClientCardsServiceServiceLocator locator = new ClientCardsServiceServiceLocator();
        try {
            ClientCardsService_PortType service = locator.getClientCardsService();
            ClientCardsRS clientCardsRS = service.execute(request);
            return clientCardsRS;
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            throw new EBankingException("Exception while executing ClientCard service", e.getMessage());
        }
    }
}
