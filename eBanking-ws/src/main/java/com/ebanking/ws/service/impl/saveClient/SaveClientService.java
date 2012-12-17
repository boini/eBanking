package com.ebanking.ws.service.impl.saveClient;

import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.SaveClientRQ;
import com.ebanking.ws.service.response.SaveClientRS;

public class SaveClientService extends SpringSupportService implements Service<SaveClientRQ, SaveClientRS> {
    private ClientDAO clientDAO;

    @Override
    public SaveClientRS execute(SaveClientRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        clientDAO = (ClientDAO) getBean("clientDAO");

        logger.logRQRS(request, SaveClientService.class);

        Client client = request.getClient();
        clientDAO.saveOrUpdate(client);

        SaveClientRS saveClientRS = new SaveClientRS();
        saveClientRS.setSuccess(true);

        logger.logRQRS(saveClientRS, SaveClientService.class);

        return saveClientRS;
    }
}
