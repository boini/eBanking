package com.ebanking.cui.presentation.action.payment.communications;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
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
 * User: antonkholodok
 * Date: 12/4/12
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class CommunicationsPaymentSubmitAction extends BaseRQRSAction<PaymentRQ, PaymentRS> {

    @Override
    @Autowired
    @Qualifier("paymentService")
    public void setServiceClient(ServiceClient<PaymentRQ, PaymentRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected PaymentRQ prepareRequest() {
        PaymentRQ communicationsPaymentRQ = new PaymentRQ();
        CommunicationsPaymentForm communicationsPaymentForm = HttpSessionUtil.getMobilePaymentForm();

        communicationsPaymentRQ.setAmount(communicationsPaymentForm.getAmount());
        communicationsPaymentRQ.setFrom(communicationsPaymentForm.getCardId());

        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = principal.getClient();
        communicationsPaymentRQ.setClient(client);

        communicationsPaymentRQ.setKey(communicationsPaymentForm.getNumber());
        communicationsPaymentRQ.setTo(communicationsPaymentForm.getProviderName().toString());
        communicationsPaymentRQ.setDate(Calendar.getInstance());

        return communicationsPaymentRQ;
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
