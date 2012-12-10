package com.ebanking.cui.presentation.action.payment.electricity;

import com.ebanking.cui.presentation.form.payments.ElectricityPaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 23:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElectricityPaymentAmountForwardAction {
    private String number;
    private long cardId;

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String execute() throws Exception {
        ElectricityPaymentForm electricityPaymentForm = HttpSessionUtil.getElectricityPaymentForm();
        electricityPaymentForm.setCardId(cardId);
        electricityPaymentForm.setNumber(number);
        return "success";
    }
}
