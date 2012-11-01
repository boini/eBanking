package com.ebanking.ws.dao;

import com.ebanking.ws.model.address.Country;

import java.util.List;

public interface CountryDAO {
    void saveOrUpdate(Country country);
    Country getById(Long id);
    List list();
    void delete(Country country);
}
