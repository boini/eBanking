package com.ebanking.cui.presentation.action.payment.mobile;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.payments.ServicePaymentForm;
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
public class MobilePaymentSubmitAction extends BaseRQRSAction<PaymentRQ, PaymentRS> {

    @Override
    @Autowired
    @Qualifier("paymentService")
    public void setServiceClient(ServiceClient<PaymentRQ, PaymentRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected PaymentRQ prepareRequest() {
        PaymentRQ mobilePaymentRQ = new PaymentRQ();
        ServicePaymentForm mobilePaymentForm = HttpSessionUtil.getMobilePaymentForm();

        mobilePaymentRQ.setAmount(mobilePaymentForm.getAmount());
        mobilePaymentRQ.setFrom(mobilePaymentForm.getCardId());

        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = principal.getClient();
        mobilePaymentRQ.setClient(client);

        mobilePaymentRQ.setKey(mobilePaymentForm.getNumber());
        mobilePaymentRQ.setTo(mobilePaymentForm.getProviderName().toString());
        mobilePaymentRQ.setDate(Calendar.getInstance());

        return mobilePaymentRQ;
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
