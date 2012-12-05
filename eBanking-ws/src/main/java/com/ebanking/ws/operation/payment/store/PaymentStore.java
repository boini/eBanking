package com.ebanking.ws.operation.payment.store;

import com.ebanking.ws.service.request.PaymentRQ;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 6:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaymentStore {
    private volatile Queue<PaymentRQ> paymentRequests = null;
    private static PaymentStore instance;

    private PaymentStore() {
        paymentRequests = new ConcurrentLinkedQueue<PaymentRQ>();
    }

    public static PaymentStore getInstance() {
        if (instance == null) {
            synchronized (PaymentStore.class) {
                if (instance == null) {
                    instance = new PaymentStore();
                }
            }
        }
        return instance;
    }

    public void addPaymentRequest(PaymentRQ paymentRQ) {
        paymentRequests.add(paymentRQ);
    }

    public PaymentRQ pollPaymentRequest() {
        if (paymentRequests.size() > 0) {
            return paymentRequests.poll();
        } else {
            return null;
        }
    }
}
