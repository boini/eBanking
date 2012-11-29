package com.ebanking.cui.presentation.action.currency;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.client.impl.currency.nbrb.CurrenciesRef;
import com.ebanking.cui.service.client.impl.currency.nbrb.CurrenciesRefResponseCurrenciesRefResult;
import org.apache.axis.message.MessageElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class NBRBCurrencyAction extends BaseRQRSAction<CurrenciesRef, CurrenciesRefResponseCurrenciesRefResult> {

    @Override
    @Autowired
    @Qualifier("nbrbCurrencyService")
    public void setServiceClient(ServiceClient<CurrenciesRef, CurrenciesRefResponseCurrenciesRefResult> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected CurrenciesRef prepareRequest() {
        CurrenciesRef currenciesRef = new CurrenciesRef(0);
        return currenciesRef;
    }

    @Override
    protected String processResponse(CurrenciesRefResponseCurrenciesRefResult responseObject) {
        return "success";
    }
}
