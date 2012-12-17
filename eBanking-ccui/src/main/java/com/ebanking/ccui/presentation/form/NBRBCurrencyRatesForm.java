package com.ebanking.ccui.presentation.form;

import com.ebanking.ccui.model.rate.NewDataSet;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/30/12
 * Time: 7:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class NBRBCurrencyRatesForm {
    private NewDataSet rates;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public NewDataSet getRates() {
        return rates;
    }

    public void setRates(NewDataSet rates) {
        this.rates = rates;
    }
}
