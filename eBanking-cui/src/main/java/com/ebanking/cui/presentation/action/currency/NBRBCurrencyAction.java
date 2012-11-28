package com.ebanking.cui.presentation.action.currency;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.client.impl.currency.nbrb.CurrenciesRef;
import com.ebanking.cui.service.client.impl.currency.nbrb.CurrenciesRefResponseCurrenciesRefResult;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/25/12
 * Time: 2:27 AM
 * To change this template use File | Settings | File Templates.
 */
public class NBRBCurrencyAction extends BaseRQRSAction<CurrenciesRef, CurrenciesRefResponseCurrenciesRefResult> {

    @Override
    @Autowired
    @Qualifier(value = "NBRBCurencyService")
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
        System.out.print(responseObject);
        return "success";
    }
}
