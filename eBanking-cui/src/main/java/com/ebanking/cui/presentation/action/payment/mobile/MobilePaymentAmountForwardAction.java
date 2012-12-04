package com.ebanking.cui.presentation.action.payment.mobile;

import com.ebanking.cui.presentation.form.MobilePaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/4/12
 * Time: 5:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class MobilePaymentAmountForwardAction {
    private String number;
    private long cardId;

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String execute() throws Exception {
        MobilePaymentForm mobilePaymentForm1 = HttpSessionUtil.getMobilePaymentForm();
        mobilePaymentForm1.setCardId(cardId);
        mobilePaymentForm1.setNumber(number);
        return "success";
    }
}
