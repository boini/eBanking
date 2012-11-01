package com.ebanking.ws.dao.impl.account;

import com.ebanking.ws.dao.CityDAO;
import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.address.City;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class ClientDAOImpl extends CommonDAOImpl implements ClientDAO {

    @Override
    public void saveOrUpdate(Client client) {
        currentSession().saveOrUpdate(client);
    }

    @Override
    public Client getById(Long id) {
        return (Client) currentSession().get(Client.class, id);
    }

    @Override
    public List list() {
        return currentSession().createCriteria(Client.class).list();
    }

    @Override
    public void delete(Client client) {
        currentSession().delete(client);
    }
}
