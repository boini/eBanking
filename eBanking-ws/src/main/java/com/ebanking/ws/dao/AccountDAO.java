package com.ebanking.ws.dao;

import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.model.account.Role;
import com.ebanking.ws.model.address.City;

import java.util.List;

/**
 * DAO for account class
 */
public interface AccountDAO {
    /**
     * Save or update account instance
     * @param account Account instance
     */
    void saveOrUpdate(Account account);

    /**
     * Gets account by specified id
     * @param id Account id
     * @return Account by id
     */
    Account getById(Long id);

    /**
     * Gets list of all accounts
     * @return Accounts list
     */
    List list();

    /**
     * Deletes specified account
     * @param account
     */
    void delete(Account account);

    /**
     * Gets roles list
     * @return Roles list
     */
    List roleList();

    /**
     * Gets role by specified id
     * @param id Role id
     * @return Role instance
     */
    Role getRoleById(Long id);
}
