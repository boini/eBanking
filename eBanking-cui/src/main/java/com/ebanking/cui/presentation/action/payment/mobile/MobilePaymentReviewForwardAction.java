package com.ebanking.cui.presentation.action.payment.mobile;

import com.ebanking.cui.presentation.form.payments.MobilePaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/3/12
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class MobilePaymentReviewForwardAction {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String execute() throws Exception {
        MobilePaymentForm mobilePaymentForm = HttpSessionUtil.getMobilePaymentForm();
        mobilePaymentForm.setAmount(amount);
        Date currentDate = new Date();
        mobilePaymentForm.setDate(currentDate);
        return "success";
    }
}
