package com.ebanking.ws.dao.impl.address;

import com.ebanking.ws.dao.CountryDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.address.Country;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CountryDAOImpl extends CommonDAOImpl implements CountryDAO {

    @Override
    public void saveOrUpdate(Country country) {
        currentSession().saveOrUpdate(country);
    }

    @Override
    public Country getById(Long id) {
        return (Country) currentSession().get(Country.class, id);
    }

    @Override
    public List list() {
        return currentSession().createCriteria(Country.class).list();
    }

    @Override
    public void delete(Country country) {
        currentSession().delete(country);
    }
}
