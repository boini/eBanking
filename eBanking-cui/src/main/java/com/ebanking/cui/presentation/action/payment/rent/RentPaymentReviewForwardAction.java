package com.ebanking.cui.presentation.action.payment.rent;

import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.RentPaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 23:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class RentPaymentReviewForwardAction {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String execute() throws Exception {
        RentPaymentForm rentPaymentForm = HttpSessionUtil.getRentPaymentForm();
        rentPaymentForm.setAmount(amount);
        Date currentDate = new Date();
        rentPaymentForm.setDate(currentDate);
        return "success";
    }
}
