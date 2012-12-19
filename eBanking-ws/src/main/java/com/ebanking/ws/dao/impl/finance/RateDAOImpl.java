package com.ebanking.ws.dao.impl.finance;

import com.ebanking.ws.dao.RateDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.finance.Currency;
import com.ebanking.ws.model.finance.Rate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class RateDAOImpl extends CommonDAOImpl implements RateDAO {
    @Override
    public List list() {
        return currentSession().createQuery("from Rate").list();
    }

    @Override
    public Rate getByCurrency(Currency currency) {
        List rates = currentSession().createQuery("from Rate as rate where rate.currency.currencyId = ?")
                .setLong(0, currency.getCurrencyId())
                .list();
        if (rates != null && rates.size() > 0) {
            return (Rate) rates.get(0);
        } else {
            return null;
        }
    }

    @Override
    public Rate getById(long id) {
        return (Rate) currentSession().get(Rate.class, id);
    }

    @Override
    public void saveOrUpdate(Rate rate) {
        currentSession().saveOrUpdate(rate);
    }
}
