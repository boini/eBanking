package com.ebanking.ccui.presentation.action.finance;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.finance.Currency;
import com.ebanking.ccui.model.finance.Rate;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.RatesForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.RatesRQ;
import com.ebanking.ccui.service.response.RatesRS;
import com.ebanking.ccui.session.HttpSessionUtil;
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
