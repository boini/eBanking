package com.ebanking.cui.presentation.action.statement.client;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.presentation.form.ClientOpertaionHistoryForm;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.client.impl.info.card.OperationRequestType;
import com.ebanking.cui.service.request.OperationHistoryRQ;
import com.ebanking.cui.service.response.OperationHistoryRS;
import com.ebanking.cui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/9/12
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientHistoryAction extends BaseRQRSAction<OperationHistoryRQ, OperationHistoryRS> {
    @Autowired
    private ClientOpertaionHistoryForm clientOpertaionHistoryForm;

    @Override
    @Autowired
    @Qualifier(value = "operationHistoryService")
    public void setServiceClient(ServiceClient<OperationHistoryRQ, OperationHistoryRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected OperationHistoryRQ prepareRequest() {
        OperationHistoryRQ clientOperationHistoryRQ = new OperationHistoryRQ();
        Account principal = (Account) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        long[] idList = new long[1];
        idList[0] = principal.getClient().getClientId();
        clientOperationHistoryRQ.setIdList(idList);
        clientOperationHistoryRQ.setOperationRequestType(OperationRequestType.CLIENT.toString());
        return clientOperationHistoryRQ;
    }

    @Override
    protected String processResponse(OperationHistoryRS responseObject) {
        clientOpertaionHistoryForm = new ClientOpertaionHistoryForm();
        clientOpertaionHistoryForm.setOperations(responseObject.getOperations());
        HttpSessionUtil.setClientOperationHistoryForm(clientOpertaionHistoryForm);
        return "success";
    }
}
