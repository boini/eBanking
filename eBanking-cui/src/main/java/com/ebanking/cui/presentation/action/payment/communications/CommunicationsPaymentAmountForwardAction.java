package com.ebanking.cui.presentation.action.payment.communications;

import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/4/12
 * Time: 5:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class CommunicationsPaymentAmountForwardAction {
    private String number;
    private long cardId;

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String execute() throws Exception {
        CommunicationsPaymentForm communicationsPaymentForm1 = HttpSessionUtil.getMobilePaymentForm();
        communicationsPaymentForm1.setCardId(cardId);
        communicationsPaymentForm1.setNumber(number);
        return "success";
    }
}
