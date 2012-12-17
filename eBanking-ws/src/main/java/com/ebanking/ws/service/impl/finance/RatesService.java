package com.ebanking.ws.service.impl.finance;

import com.ebanking.ws.dao.RateDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.finance.Currency;
import com.ebanking.ws.model.finance.Rate;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.RatesRQ;
import com.ebanking.ws.service.response.RatesRS;

import java.util.ArrayList;
import java.util.List;

public class RatesService extends SpringSupportService implements Service<RatesRQ, RatesRS> {
    private RateDAO rateDAO;

    @Override
    public RatesRS execute(RatesRQ request) {
        rateDAO = (RateDAO) getBean("rateDAO");
        logger = (RQRSLogger) getBean("RQRSLogger");

        logger.logRQRS(request, RatesService.class);

        Currency[] currencies = request.getCurrencies();
        List<Rate> rates = new ArrayList<Rate>();

        if (currencies == null || currencies.length == 0) {
            rates.addAll(rateDAO.list());
        } else {
            for (Currency currency : currencies) {
                Rate rate = rateDAO.getByCurrency(currency);
                if (rate != null) {
                    rates.add(rateDAO.getByCurrency(currency));
                }
            }
        }

        RatesRS ratesRS = new RatesRS();
        Rate[] rateArray = rates.toArray(new Rate[rates.size()]);
        ratesRS.setRates(rateArray);

        logger.logRQRS(ratesRS, RatesService.class);

        return ratesRS;
    }
}
