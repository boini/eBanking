package com.ebanking.cui.presentation.action.statement.online;

import com.ebanking.cui.model.operation.Operation;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.CardOperationHistoryRQ;
import com.ebanking.cui.service.response.CardOperationHistoryRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/7/12
 * Time: 8:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardOperationHistoryAction extends BaseRQRSAction<CardOperationHistoryRQ, CardOperationHistoryRS> {
    private String cardIdList;
    private String fromDate;
    private String toDate;
    private List<Operation> operations;

    public String getCardIdList() {
        return cardIdList;
    }

    public void setCardIdList(String cardIdList) {
        this.cardIdList = cardIdList;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
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

        String[] cardIdArrayStr = cardIdList.split(",");
        long[] cardIdArray = new long[cardIdArrayStr.length];
        for (int index = 0; index < cardIdArray.length; ++index) {
            cardIdArray[index] = Long.valueOf(cardIdArrayStr[index]);
        }

        DateFormat formatter = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
        Calendar fromCalendar = Calendar.getInstance();
        Calendar toCalendar = Calendar.getInstance();
        try {
            Date fromDateFormatted = (Date)formatter.parse(fromDate);
            Date toDateFormatted = (Date)formatter.parse(toDate);
            fromCalendar.setTime(fromDateFormatted);
            toCalendar.setTime(toDateFormatted);
        } catch (ParseException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        cardOperationHistoryRQ.setCardIdList(cardIdArray);
        cardOperationHistoryRQ.setFromDate(fromCalendar);
        cardOperationHistoryRQ.setToDate(toCalendar);

        return cardOperationHistoryRQ;
    }

    @Override
    protected String processResponse(CardOperationHistoryRS responseObject) {
        Operation[] operationArray = responseObject.getOperations();
        operations = new ArrayList(Arrays.asList(operationArray));
        return "success";
    }
}
