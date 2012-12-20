package com.ebanking.ws.dao;

import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.account.Corporation;
import com.ebanking.ws.model.finance.Currency;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/6/12
 * Time: 6:05 AM
 * To change this template use File | Settings | File Templates.
 */
public interface BankAccountDAO {
    BankAccount getBankAccountById(long id);
    void saveOrUpdate(BankAccount bankAccount);
    BankAccount getByCurrencyAndName(Currency currency, Corporation corporation);
}
