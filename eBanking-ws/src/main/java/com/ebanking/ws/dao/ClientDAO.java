package com.ebanking.ws.dao;

import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.address.City;

import java.util.List;

public interface ClientDAO {
    void saveOrUpdate(Client client);
    Client getById(Long id);
    List list();
    void delete(Client client);
    List search(String firstname, String lastname);
}
