package com.ebanking.ws.service.impl.payment.validator;

import com.ebanking.ws.service.request.PaymentRQ;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 7:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaymentValidator {
    public static boolean validate(PaymentRQ paymentRQ) {
        return (paymentRQ.getAmount() > 0 &&
                paymentRQ.getClient() != null &&
                paymentRQ.getDate() != null &&
                paymentRQ.getFrom() > 0 &&
                paymentRQ.getKey() != null &&
                paymentRQ.getTo() != null);
    }
}
