package com.ebanking.cui.presentation.action.payment.rent;

import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.RentPaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 23:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class RentPaymentAmountForwardAction {
    private String number;
    private long cardId;

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String execute() throws Exception {
        RentPaymentForm rentPaymentForm = HttpSessionUtil.getRentPaymentForm();
        rentPaymentForm.setCardId(cardId);
        rentPaymentForm.setNumber(number);
        return "success";
    }
}
