package com.ebanking.cui.service.client.impl.currency.nbrb;

import com.ebanking.cui.service.client.ServiceClient;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/28/12
 * Time: 9:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class NBRBCurrencyService implements ServiceClient<Calendar, ExRatesDailyResponseExRatesDailyResult> {


    @Override
    public ExRatesDailyResponseExRatesDailyResult execute(Calendar calendar) {
        ExRatesLocator locator = new ExRatesLocator();
        try {
            ExRatesSoap_PortType service = locator.getExRatesSoap();
            ExRatesDailyResponseExRatesDailyResult result = service.exRatesDaily(calendar);
            return result;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
