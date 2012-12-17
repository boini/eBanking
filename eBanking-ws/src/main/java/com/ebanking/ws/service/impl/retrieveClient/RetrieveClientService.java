package com.ebanking.ws.service.impl.retrieveClient;

import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.RetrieveClientRQ;
import com.ebanking.ws.service.response.RetrieveClientRS;

import java.util.ArrayList;
import java.util.List;

public class RetrieveClientService extends SpringSupportService implements Service<RetrieveClientRQ, RetrieveClientRS> {
    private ClientDAO clientDAO;

    @Override
    public RetrieveClientRS execute(RetrieveClientRQ request) {
        clientDAO = (ClientDAO) getBean("clientDAO");

        String type = request.getType();
        RetrieveClientType retrieveClientType = RetrieveClientType.valueOf(type.toUpperCase());

        List<Client> clients = new ArrayList<Client>();
        RetrieveClientRS retrieveClientRS = new RetrieveClientRS();

        switch (retrieveClientType) {
            case ALL:
                clients = clientDAO.list();
                break;
            case ID:
                long id = request.getClientId();
                Client client = clientDAO.getById(id);
                clients.add(client);
                break;
        }

        if (clients != null) {
            retrieveClientRS.setSuccess(true);
            Client[] clientsArray = clients.toArray(new Client[clients.size()]);
            retrieveClientRS.setClients(clientsArray);
        } else {
            retrieveClientRS.setSuccess(false);
        }

        return retrieveClientRS;
    }
}