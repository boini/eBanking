package com.ebanking.ws.dao;

import com.ebanking.ws.model.address.City;

import java.util.List;

public interface CityDAO {
    void saveOrUpdate(City country);
    City getById(Long id);
    List list();
    void delete(City country);
}
