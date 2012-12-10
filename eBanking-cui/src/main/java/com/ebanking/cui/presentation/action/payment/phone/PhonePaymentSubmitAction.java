package com.ebanking.cui.presentation.action.payment.phone;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.PhonePaymentForm;
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
 * Time: 17:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhonePaymentSubmitAction extends BaseRQRSAction<PaymentRQ, PaymentRS> {

    @Override
    @Autowired
    @Qualifier("paymentService")
    public void setServiceClient(ServiceClient<PaymentRQ, PaymentRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected PaymentRQ prepareRequest() {
        PaymentRQ phonePaymentRQ = new PaymentRQ();
        PhonePaymentForm phonePaymentForm = HttpSessionUtil.getPhonePaymentForm();

        phonePaymentRQ.setAmount(phonePaymentForm.getAmount());
        phonePaymentRQ.setFrom(phonePaymentForm.getCardId());

        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = principal.getClient();
        phonePaymentRQ.setClient(client);

        phonePaymentRQ.setKey(phonePaymentForm.getKey());
        phonePaymentRQ.setTo(phonePaymentForm.getProviderName().toString());
        phonePaymentRQ.setDate(Calendar.getInstance());

        return phonePaymentRQ;
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
