package com.ebanking.ws.operation.payment.quartz;

import com.ebanking.ws.operation.payment.store.PaymentStore;
import com.ebanking.ws.service.request.PaymentRQ;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 8:20 AM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class PaymentPeekerService {

    public void execute() {
        PaymentRQ paymentRQ = PaymentStore.getInstance().pollPaymentRequest();
        if (paymentRQ != null) {
            System.out.println("[" + new Date() + "] " + paymentRQ.getAmount());
        } else {
            System.out.println("[" + new Date() + "] EMPTY");
        }
    }
}
