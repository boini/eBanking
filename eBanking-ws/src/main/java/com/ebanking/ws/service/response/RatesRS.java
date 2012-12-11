package com.ebanking.ws.service.response;

import com.ebanking.ws.model.finance.Rate;

public class RatesRS {
    private Rate[] rates;

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }
}
