package com.ebanking.cui.presentation.action.finance;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.model.finance.Currency;
import com.ebanking.cui.model.finance.Rate;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.RatesForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.RatesRQ;
import com.ebanking.cui.service.response.RatesRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RatesAction extends BaseRQRSAction<RatesRQ, RatesRS> {
    @Autowired
    private RatesForm ratesForm;

    @Override
    @Autowired
    @Qualifier(value = "ratesService")
    public void setServiceClient(ServiceClient<RatesRQ, RatesRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected RatesRQ prepareRequest() {
        RatesRQ ratesRQ = new RatesRQ();
        Currency[] currencies = new Currency[0];
        ratesRQ.setCurrencies(currencies);
        return ratesRQ;
    }

    @Override
    protected String processResponse(RatesRS responseObject) throws EBankingException {
        Rate[] rates = responseObject.getRates();
        if (rates == null) {
            throw new EBankingException("Error while processing Rates response for RatesAction. Rates array is null");
        }
        ratesForm.setRates(rates);
        HttpSessionUtil.setRatesForm(ratesForm);
        return "success";
    }
}
