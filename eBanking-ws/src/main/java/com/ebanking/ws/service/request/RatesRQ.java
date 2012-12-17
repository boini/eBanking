package com.ebanking.ws.service.request;

import com.ebanking.ws.model.finance.Currency;

import java.util.Arrays;

public class RatesRQ {
    private Currency[] currencies;

    public Currency[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(Currency[] currencies) {
        this.currencies = currencies;
    }

    @Override
    public String toString() {
        return "RatesRQ{" +
                "currencies=" + (currencies == null ? null : Arrays.asList(currencies)) +
                '}';
    }
}
