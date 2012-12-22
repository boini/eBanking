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

    @Override
    public List search(String firstname, String lastname) {
        if (firstname != null) {
            if (lastname != null) {
                return currentSession().createQuery("from Client client where (client.firstname like ? and client.lastname like ?)")
                        .setString(0, "%" + firstname + "%").setString(1, "%" + lastname + "%").list();
            } else {
                return currentSession().createQuery("from Client client where client.firstname like ?")
                        .setString(0, "%" + firstname + "%").list();
            }
        } else {
            return currentSession().createQuery("from Client client where client.lastname like ?")
                    .setString(0, "%" + lastname + "%").list();
        }

    }
}
