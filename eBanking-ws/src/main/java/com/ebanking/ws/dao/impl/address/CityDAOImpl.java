package com.ebanking.ws.dao.impl.address;

import com.ebanking.ws.dao.CityDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.address.City;
import com.ebanking.ws.model.address.Country;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CityDAOImpl extends CommonDAOImpl implements CityDAO {

    @Override
    public void saveOrUpdate(City city) {
        currentSession().saveOrUpdate(city);
    }

    @Override
    public City getById(Long id) {
        return (City) currentSession().get(City.class, id);
    }

    @Override
    public List list() {
        return currentSession().createCriteria(City.class).list();
    }

    @Override
    public void delete(City city) {
        currentSession().delete(city);
    }
}
