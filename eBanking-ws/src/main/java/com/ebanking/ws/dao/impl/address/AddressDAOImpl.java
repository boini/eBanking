package com.ebanking.ws.dao.impl.address;

import com.ebanking.ws.dao.AddressDAO;
import com.ebanking.ws.dao.CityDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.address.Address;
import com.ebanking.ws.model.address.City;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AddressDAOImpl extends CommonDAOImpl implements AddressDAO {

    @Override
    public void saveOrUpdate(Address address) {
        currentSession().saveOrUpdate(address);
    }

    @Override
    public Address getById(Long id) {
        return (Address) currentSession().get(Address.class, id);
    }

    @Override
    public List list() {
        return currentSession().createCriteria(Address.class).list();
    }

    @Override
    public void delete(Address address) {
        currentSession().delete(address);
    }
}
