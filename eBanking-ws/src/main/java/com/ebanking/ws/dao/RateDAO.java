package com.ebanking.ws.dao;

import com.ebanking.ws.model.finance.Currency;
import com.ebanking.ws.model.finance.Rate;

import java.util.List;

public interface RateDAO {
    List list();
    Rate getByCurrency(Currency currency);
    Rate getById(long id);
    void saveOrUpdate(Rate rate);
}
