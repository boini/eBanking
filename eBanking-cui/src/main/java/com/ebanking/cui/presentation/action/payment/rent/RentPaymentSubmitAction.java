package com.ebanking.cui.presentation.action.payment.rent;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.RentPaymentForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.PaymentRQ;
import com.ebanking.cui.service.response.PaymentRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 23:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class RentPaymentSubmitAction extends BaseRQRSAction<PaymentRQ, PaymentRS> {

    @Override
    @Autowired
    @Qualifier("paymentService")
    public void setServiceClient(ServiceClient<PaymentRQ, PaymentRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected PaymentRQ prepareRequest() {
        PaymentRQ rentPaymentRQ = new PaymentRQ();
        RentPaymentForm rentPaymentForm = HttpSessionUtil.getRentPaymentForm();

        rentPaymentRQ.setAmount(rentPaymentForm.getAmount());
        rentPaymentRQ.setFrom(rentPaymentForm.getCardId());

        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = principal.getClient();
        rentPaymentRQ.setClient(client);

        rentPaymentRQ.setKey(rentPaymentForm.getKey());
        rentPaymentRQ.setTo(rentPaymentForm.getProviderName().toString());
        rentPaymentRQ.setDate(Calendar.getInstance());

        return rentPaymentRQ;
    }

    @Override
    protected String processResponse(PaymentRS responseObject) {
        if (responseObject.isSuccess()) {
            return "success";
        } else {
            return "failure";
        }
    }
}
