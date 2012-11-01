package com.ebanking.ws.dao;

import com.ebanking.ws.model.address.Address;
import com.ebanking.ws.model.address.City;

import java.util.List;

public interface AddressDAO {
    /**
     * Save or update address instance
     * @param address Address entity
     */
    void saveOrUpdate(Address address);

    /**
     * Gets address by specified id
     * @param id Address id
     * @return Address instance
     */
    Address getById(Long id);

    /**
     * Gets list of addresses
     * @return Addresses list
     */
    List list();

    /**
     * Delete specified address
     * @param address Address instance
     */
    void delete(Address address);
}
