package com.ebanking.ccui.presentation.action.corporation;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.BankAccount;
import com.ebanking.ccui.model.account.Corporation;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.CorporationRQ;
import com.ebanking.ccui.service.response.CorporationRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class CorporationViewAction extends BaseRQRSAction<CorporationRQ, CorporationRS> {
    private long corporationId;
    private Corporation corporation;
    private BankAccount[] bankAccounts;

    public Corporation getCorporation() {
        return corporation;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setCorporationId(long corporationId) {
        this.corporationId = corporationId;
    }

    @Override
    @Autowired
    @Qualifier(value = "corporationService")
    public void setServiceClient(ServiceClient<CorporationRQ, CorporationRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected CorporationRQ prepareRequest() throws EBankingException {
        CorporationRQ corporationRQ = new CorporationRQ();
        corporationRQ.setCorporationId(corporationId);
        return corporationRQ;
    }

    @Override
    protected String processResponse(CorporationRS responseObject) throws EBankingException {
        corporation = responseObject.getCorporations()[0];
        bankAccounts = responseObject.getBankAccounts();
        return "success";
    }
}
