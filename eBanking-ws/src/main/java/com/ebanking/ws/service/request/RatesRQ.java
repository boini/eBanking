package com.ebanking.ws.service.request;

import com.ebanking.ws.model.finance.Currency;
import com.ebanking.ws.model.finance.Rate;

public class RatesRQ {
    private Currency[] currencies;

    public Currency[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Currency[] currencies) {
        this.currencies = currencies;
    }
}
