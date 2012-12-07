package com.ebanking.cui.presentation.action.info;

import com.ebanking.cui.model.operation.Operation;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.CardOperationHistoryRQ;
import com.ebanking.cui.service.request.PaymentRQ;
import com.ebanking.cui.service.response.CardOperationHistoryRS;
import com.ebanking.cui.service.response.PaymentRS;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/7/12
 * Time: 8:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardOperationHistoryAction extends BaseRQRSAction<CardOperationHistoryRQ, CardOperationHistoryRS> {
    private Map<Long, Boolean> checkboxes;
    private List<Operation> operations;

    public Map<Long, Boolean> getCheckboxes() {
        return checkboxes;
    }

    public void setCheckboxes(Map<Long, Boolean> checkboxes) {
        this.checkboxes = checkboxes;
    }

    @Override
    @Autowired
    @Qualifier("cardOperationHistoryService")
    public void setServiceClient(ServiceClient<CardOperationHistoryRQ, CardOperationHistoryRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    public String getJson() throws Exception {
        return execute();
    }

    @Override
    protected CardOperationHistoryRQ prepareRequest() {
        CardOperationHistoryRQ cardOperationHistoryRQ = new CardOperationHistoryRQ();

        List<Long> checkedList = new ArrayList<Long>();
        Set<Long> keySet = checkboxes.keySet();
        for (Long key : keySet) {
            boolean checked = checkboxes.get(key);
            if (checked) {
                checkedList.add(key);
            }
        }

        long[] cardIdArray = new long[checkedList.size()];
        for (int index = 0; index < checkedList.size(); ++index) {
            cardIdArray[index] = checkedList.get(index);
        }

        cardOperationHistoryRQ.setCardIdList(cardIdArray);
        cardOperationHistoryRQ.setFromDate(Calendar.getInstance());
        cardOperationHistoryRQ.setToDate(Calendar.getInstance());

        return cardOperationHistoryRQ;
    }

    @Override
    protected String processResponse(CardOperationHistoryRS responseObject) {
        System.out.println(responseObject);
        return "success";
    }
}
