package com.ebanking.cui.presentation.action.transfer;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.transfer.TransferForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.TransferRQ;
import com.ebanking.cui.service.response.TransferRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Calendar;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/13/12
 * Time: 12:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransferSubmitAction extends BaseRQRSAction<TransferRQ, TransferRS> {
    @Override
    @Autowired
    @Qualifier(value = "transferService")
    public void setServiceClient(ServiceClient<TransferRQ, TransferRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected TransferRQ prepareRequest() {
        TransferForm transferForm = HttpSessionUtil.getTransferForm();

        TransferRQ transferRQ = new TransferRQ();
        transferRQ.setDate(Calendar.getInstance());
        transferRQ.setAmount(transferForm.getAmount());
        transferRQ.setFromCardId(transferForm.getFromCardId());
        transferRQ.setToCardId(transferForm.getToCardId());

        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Client client = principal.getClient();

        transferRQ.setClient(client);
        return transferRQ;
    }

    @Override
    protected String processResponse(TransferRS responseObject) {
        if (responseObject.isSuccess()) {
            return "success";
        } else {
            return "failure";
        }
    }
}
