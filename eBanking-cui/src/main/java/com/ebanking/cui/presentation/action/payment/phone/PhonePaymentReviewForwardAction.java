package com.ebanking.cui.presentation.action.payment.phone;

import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.PhonePaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 17:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhonePaymentReviewForwardAction {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String execute() throws Exception {
        PhonePaymentForm phonePaymentForm = HttpSessionUtil.getPhonePaymentForm();
        phonePaymentForm.setAmount(amount);
        Date currentDate = new Date();
        phonePaymentForm.setDate(currentDate);
        return "success";
    }
}
