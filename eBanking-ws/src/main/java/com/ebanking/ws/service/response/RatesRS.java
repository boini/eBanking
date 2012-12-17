package com.ebanking.ws.service.response;

import com.ebanking.ws.model.finance.Rate;

import java.util.Arrays;

public class RatesRS {
    private Rate[] rates;

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "RatesRS{" +
                "rates=" + (rates == null ? null : Arrays.asList(rates)) +
                '}';
    }
}
