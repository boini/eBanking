package com.ebanking.cui.presentation.action.autopayment;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.AutoPaymentForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.GetAutoPaymentRQ;
import com.ebanking.cui.service.response.GetAutoPaymentRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GetAutoPaymentAction extends BaseRQRSAction<GetAutoPaymentRQ, GetAutoPaymentRS> {
    private long operationId;

    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }

    private AutoPaymentForm autoPaymentForm;

    @Autowired
    public void setAutoPaymentForm(AutoPaymentForm autoPaymentForm) {
        this.autoPaymentForm = autoPaymentForm;
    }

    @Override
    @Autowired
    @Qualifier(value = "getAutoPaymentService")
    public void setServiceClient(ServiceClient<GetAutoPaymentRQ, GetAutoPaymentRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected GetAutoPaymentRQ prepareRequest() throws EBankingException {
        GetAutoPaymentRQ getAutoPaymentRQ = new GetAutoPaymentRQ();
        getAutoPaymentRQ.setOperationId(operationId);
        return getAutoPaymentRQ;
    }

    @Override
    protected String processResponse(GetAutoPaymentRS responseObject) throws EBankingException {
        autoPaymentForm.setAutoPayment(responseObject.getAutoPayment());
        autoPaymentForm.setOperation(HttpSessionUtil.getClientOperationHistoryForm().getById(operationId));
        HttpSessionUtil.setAutoPaymentForm(autoPaymentForm);
        return "success";
    }
}
