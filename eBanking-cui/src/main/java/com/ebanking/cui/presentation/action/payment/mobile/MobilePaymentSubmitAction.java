package com.ebanking.cui.presentation.action.payment.mobile;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.model.finance.Amount;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.MobilePaymentForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.MobilePaymentRQ;
import com.ebanking.cui.service.response.MobilePaymentRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.security.core.context.SecurityContextHolder;

import java.math.BigDecimal;
import java.net.HttpRetryException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/4/12
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class MobilePaymentSubmitAction extends BaseRQRSAction<MobilePaymentRQ, MobilePaymentRS> {
    @Override
    public void setServiceClient(ServiceClient<MobilePaymentRQ, MobilePaymentRS> serviceClient) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    protected MobilePaymentRQ prepareRequest() {
        MobilePaymentRQ mobilePaymentRQ = new MobilePaymentRQ();
        MobilePaymentForm mobilePaymentForm = HttpSessionUtil.getMobilePaymentForm();

        Amount amount = new Amount();
        amount.setMoney(new BigDecimal(mobilePaymentForm.getAmount()));
        amount.setCurrency(mobilePaymentForm.getActiveCard().getCardAccount().getCurrency());
        mobilePaymentRQ.setAmount(amount);

        mobilePaymentRQ.setCardId(mobilePaymentForm.getCardId());

        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = principal.getClient();
        mobilePaymentRQ.setClient(client);

        mobilePaymentRQ.setNumber(mobilePaymentForm.getNumber());

        mobilePaymentRQ.setProviderName(mobilePaymentForm.getProviderName().toString());

        return mobilePaymentRQ;
    }

    @Override
    protected String processResponse(MobilePaymentRS responseObject) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
