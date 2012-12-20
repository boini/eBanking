package com.ebanking.ws.dao.impl.account;

import com.ebanking.ws.dao.BankAccountDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.account.Corporation;
import com.ebanking.ws.model.finance.Currency;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public BankAccount getByCurrencyAndName(Currency currency, Corporation corporation) {
        List accounts = currentSession().createQuery("from BankAccount as account where (account.currency.currencyId = ? and account.corporation.corporationId = ?)")
                .setLong(0, currency.getCurrencyId())
                .setLong(1, corporation.getCorporationId())
                .list();
        if (accounts != null && accounts.size() > 0) {
            return (BankAccount) accounts.get(0);
        }
        return null;
    }
}
