package com.ebanking.cui.presentation.action.payment.communications;

import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/3/12
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class CommunicationsPaymentReviewForwardAction {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String execute() throws Exception {
        CommunicationsPaymentForm communicationsPaymentForm = HttpSessionUtil.getMobilePaymentForm();
        communicationsPaymentForm.setAmount(amount);
        Date currentDate = new Date();
        communicationsPaymentForm.setDate(currentDate);
        return "success";
    }
}
