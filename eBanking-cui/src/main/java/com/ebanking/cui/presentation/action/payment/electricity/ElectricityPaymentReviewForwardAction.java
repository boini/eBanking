package com.ebanking.cui.presentation.action.payment.electricity;

import com.ebanking.cui.presentation.form.payments.ElectricityPaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 23:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ElectricityPaymentReviewForwardAction {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String execute() throws Exception {
        ElectricityPaymentForm electricityPaymentForm = HttpSessionUtil.getElectricityPaymentForm();
        electricityPaymentForm.setAmount(amount);
        Date currentDate = new Date();
        electricityPaymentForm.setDate(currentDate);
        return "success";
    }
}
