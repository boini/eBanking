package com.ebanking.ws.service.impl.retrieveClient;

import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.log.RQRSLogger;
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
        logger = (RQRSLogger) getBean("RQRSLogger");
        clientDAO = (ClientDAO) getBean("clientDAO");

        logger.logRQRS(request, RetrieveClientService.class);

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
            case SEARCH:
                String firstname = request.getSearchField();
                String lastname = request.getSearchKey();
                clients = clientDAO.search(firstname, lastname);
                if (clients.size() == 0) {
                    clients = null;
                    retrieveClientRS.setException("No clients where found!");
                }
                break;
        }

        if (clients != null) {
            retrieveClientRS.setSuccess(true);
            Client[] clientsArray = clients.toArray(new Client[clients.size()]);
            retrieveClientRS.setClients(clientsArray);
        } else {
            retrieveClientRS.setSuccess(false);
        }

        //logger.logRQRS(retrieveClientRS, RetrieveClientService.class);

        return retrieveClientRS;
    }
}
