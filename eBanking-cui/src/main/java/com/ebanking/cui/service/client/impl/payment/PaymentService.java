package com.ebanking.cui.service.client.impl.payment;

import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.PaymentRQ;
import com.ebanking.cui.service.response.PaymentRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/5/12
 * Time: 7:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class PaymentService implements ServiceClient<PaymentRQ, PaymentRS> {
    @Override
    public PaymentRS execute(PaymentRQ request) {
        PaymentServiceServiceLocator locator = new PaymentServiceServiceLocator();
        try {
            PaymentService_PortType service = locator.getPaymentService();
            PaymentRS paymentRS = service.execute(request);
            return paymentRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
