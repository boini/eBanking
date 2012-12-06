package com.ebanking.ws.dao.impl.account;

import com.ebanking.ws.dao.BankAccountDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.account.BankAccount;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/6/12
 * Time: 6:06 AM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class BankAccountDAOImpl extends CommonDAOImpl implements BankAccountDAO {
    @Override
    public BankAccount getBankAccountById(long id) {
        return (BankAccount) currentSession().get(BankAccount.class, id);
    }

    @Override
    public void saveOrUpdate(BankAccount bankAccount) {
        currentSession().saveOrUpdate(bankAccount);
    }
}
