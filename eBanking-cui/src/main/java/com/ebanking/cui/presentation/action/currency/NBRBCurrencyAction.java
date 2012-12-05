package com.ebanking.cui.presentation.action.currency;

import com.ebanking.cui.model.rate.NewDataSet;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.NBRBCurrencyRatesForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.client.impl.currency.nbrb.ExRatesDailyResponseExRatesDailyResult;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.w3c.dom.Node;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.Calendar;
import java.util.Date;

public class NBRBCurrencyAction extends BaseRQRSAction<Calendar, ExRatesDailyResponseExRatesDailyResult> {

    @Autowired
    private NBRBCurrencyRatesForm nbrbCurrencyRatesForm;

    @Override
    @Autowired
    @Qualifier("nbrbCurrencyService")
    public void setServiceClient(ServiceClient<Calendar, ExRatesDailyResponseExRatesDailyResult> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected Calendar prepareRequest() {
        Calendar calendar = Calendar.getInstance();
        return calendar;
    }

    @Override
    protected String processResponse(ExRatesDailyResponseExRatesDailyResult responseObject) {
        Node node = responseObject.get_any()[1].getFirstChild();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(NewDataSet.class);
            NewDataSet newDataSet = (NewDataSet) jaxbContext.createUnmarshaller().unmarshal(node);
            nbrbCurrencyRatesForm.setRates(newDataSet);
            nbrbCurrencyRatesForm.setDate(new Date());
            HttpSessionUtil.setNbrbRatesForm(nbrbCurrencyRatesForm);
        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "success";
    }
}
