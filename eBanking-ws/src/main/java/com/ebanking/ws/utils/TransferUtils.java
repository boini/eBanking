package com.ebanking.ws.utils;

import com.ebanking.ws.dao.RateDAO;
import com.ebanking.ws.model.finance.Currency;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 13.12.12
 * Time: 0:30
 * To change this template use File | Settings | File Templates.
 */
public class TransferUtils {

    public static final String CURRENCY_CODE_BYR = "BYR";

    private RateDAO rateDAO;

    @Autowired
    public void setRateDAO(RateDAO rateDAO) {
        this.rateDAO = rateDAO;
    }

    public double convert(Currency inCurrency, Currency outCurrency, double amount) {
        if (inCurrency.getCurrencyCode().equals(outCurrency.getCurrencyCode())) {
            return amount;
        }

        boolean inCurrencyIsByr = CURRENCY_CODE_BYR.equals(inCurrency.getCurrencyCode());
        boolean outCurrencyIsByr = CURRENCY_CODE_BYR.equals(outCurrency.getCurrencyCode());

        double rateCurToBr = inCurrencyIsByr ? 1.0 : rateDAO.getByCurrency(inCurrency).getPurchase();
        double rateBrToCur = outCurrencyIsByr ? 1.0 : rateDAO.getByCurrency(outCurrency).getSale();

        double result = amount * rateCurToBr / rateBrToCur;

        //round to two decimal places
        BigDecimal bd = BigDecimal.valueOf(result);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);

        return bd.doubleValue();
    }

}
