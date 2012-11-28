package com.ebanking.ws.dao.impl.account;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.account.Role;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class AccountDAOImpl extends CommonDAOImpl implements AccountDAO {

    /**
     * Save or update account instance
     *
     * @param account Account instance
     */
    @Override
    public void saveOrUpdate(Account account) {
        currentSession().saveOrUpdate(account);
    }

    /**
     * Gets account by specified id
     *
     * @param id Account id
     * @return Account by id
     */
    @Override
    public Account getById(Long id) {
        return (Account) currentSession().get(Account.class, id);
    }

    /**
     * Gets list of all accounts
     *
     * @return Accounts list
     */
    @Override
    public List list() {
        return currentSession().createCriteria(Account.class).list();
    }

    /**
     * Deletes specified account
     *
     * @param account
     */
    @Override
    public void delete(Account account) {
        currentSession().delete(account);
    }

    /**
     * Gets roles list
     *
     * @return Roles list
     */
    @Override
    public List roleList() {
        return currentSession().createCriteria(Role.class).list();
    }

    /**
     * Gets role by specified id
     *
     * @param id Role id
     * @return Role instance
     */
    @Override
    public Role getRoleById(Long id) {
        return (Role) currentSession().get(Role.class, id);
    }

    @Override
    public Account getByLogin(String login) {
        return (Account) currentSession().createQuery("from Account as account where account.login = ?")
                .setString(0, login)
                .list().get(0);

    }
}
