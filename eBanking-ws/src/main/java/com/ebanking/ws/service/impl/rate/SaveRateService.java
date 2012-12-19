package com.ebanking.ws.service.impl.rate;

import com.ebanking.ws.dao.RateDAO;
import com.ebanking.ws.model.finance.Rate;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.SaveRateRQ;
import com.ebanking.ws.service.response.SaveRateRS;

public class SaveRateService extends SpringSupportService implements Service<SaveRateRQ, SaveRateRS> {
    private RateDAO rateDAO;

    @Override
    public SaveRateRS execute(SaveRateRQ request) {
        rateDAO = (RateDAO) getBean("rateDAO");

        long rateId = request.getRateId();
        double sale = request.getSale();
        double purchase = request.getPurchase();

        Rate rate = rateDAO.getById(rateId);
        rate.setPurchase(purchase);
        rate.setSale(sale);

        rateDAO.saveOrUpdate(rate);

        SaveRateRS saveRateRS = new SaveRateRS();
        saveRateRS.setSuccess(true);

        return saveRateRS;
    }
}
