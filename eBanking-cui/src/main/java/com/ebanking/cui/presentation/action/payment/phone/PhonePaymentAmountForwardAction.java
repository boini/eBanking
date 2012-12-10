package com.ebanking.cui.presentation.action.payment.phone;

import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.PhonePaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 17:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhonePaymentAmountForwardAction {
    private String number;
    private String credential;
    private long cardId;

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String execute() throws Exception {
        PhonePaymentForm phonePaymentForm = HttpSessionUtil.getPhonePaymentForm();
        phonePaymentForm.setCardId(cardId);
        phonePaymentForm.setNumber(number);
        phonePaymentForm.setCredential(credential);
        return "success";
    }
}
