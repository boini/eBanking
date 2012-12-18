package com.ebanking.ccui.presentation.action.corporation;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.Corporation;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.CorporationForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.CorporationRQ;
import com.ebanking.ccui.service.response.CorporationRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*;

public class CorporationListAction extends BaseRQRSAction<CorporationRQ, CorporationRS> {
    @Autowired
    private CorporationForm corporationForm;

    @Override
    @Autowired
    @Qualifier(value = "corporationService")
    public void setServiceClient(ServiceClient<CorporationRQ, CorporationRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected CorporationRQ prepareRequest() throws EBankingException {
        CorporationRQ corporationRQ = new CorporationRQ();
        corporationRQ.setCorporationId(0);
        return corporationRQ;
    }

    @Override
    protected String processResponse(CorporationRS responseObject) throws EBankingException {
        Corporation[] corporations = responseObject.getCorporations();
        Set<Corporation> corporationSet = new HashSet<Corporation>(Arrays.asList(corporations));
        List<Corporation> corporationList = new ArrayList<Corporation>(corporationSet);
        corporationForm.setCorporations(corporationList);

        HttpSessionUtil.setCorporationForm(corporationForm);

        return "success";
    }
}
