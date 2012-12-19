package com.ebanking.ws.dao.impl.finance;

import com.ebanking.ws.dao.CurrencyDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.finance.Currency;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CurrencyDAOImpl extends CommonDAOImpl implements CurrencyDAO {
    @Override
    public Currency getCurrencyByCode(String code) {
        List currencies = currentSession().createQuery("from Currency as c where c.currencyCode = ?")
                .setString(0, code)
                .list();
        if (currencies != null && currencies.size() > 0) {
            return (Currency) currencies.get(0);
        } else {
            return null;
        }
    }
}
