package com.ebanking.ws.service.impl.payment;

import com.ebanking.ws.operation.payment.store.PaymentStore;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.impl.payment.validator.PaymentValidator;
import com.ebanking.ws.service.request.PaymentRQ;
import com.ebanking.ws.service.response.PaymentRS;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 6:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaymentService implements Service<PaymentRQ, PaymentRS> {
    @Override
    public PaymentRS execute(PaymentRQ request) {
        PaymentRS paymentRS = new PaymentRS();

        if (PaymentValidator.validate(request)) {
            PaymentStore.getInstance().addPaymentRequest(request);
            paymentRS.setSuccess(true);
        } else {
            paymentRS.setSuccess(false);
            paymentRS.setException("Bad request");
        }

        return paymentRS;
    }
}
