package com.ebanking.ccui.service.client.impl.client.card;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.ClientCardsRQ;
import com.ebanking.ccui.service.response.ClientCardsRS;

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
