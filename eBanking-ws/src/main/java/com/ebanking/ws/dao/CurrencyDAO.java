package com.ebanking.ws.dao;

import com.ebanking.ws.model.finance.Currency;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/19/12
 * Time: 11:23 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CurrencyDAO {
    Currency getCurrencyByCode(String code);
}
