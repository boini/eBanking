package com.ebanking.cui.presentation.action.statement.cardAccount;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.model.operation.Operation;
import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.client.impl.info.card.OperationRequestType;
import com.ebanking.cui.service.request.OperationHistoryRQ;
import com.ebanking.cui.service.response.OperationHistoryRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/8/12
 * Time: 11:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class CardAccountHistoryAction extends BaseRQRSAction<OperationHistoryRQ, OperationHistoryRS> {
    private String idList;
    private String fromDate;
    private String toDate;
    private List<Operation> operations;

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
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
    @Qualifier("operationHistoryService")
    public void setServiceClient(ServiceClient<OperationHistoryRQ, OperationHistoryRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    public String getJson() throws Exception {
        return execute();
    }

    @Override
    protected OperationHistoryRQ prepareRequest() throws EBankingException {
        OperationHistoryRQ operationHistoryRQ = new OperationHistoryRQ();

        String[] idArrayStr = idList.split(",");
        long[] idArray = new long[idArrayStr.length];
        for (int index = 0; index < idArray.length; ++index) {
            idArray[index] = Long.valueOf(idArrayStr[index]);
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
            e.printStackTrace();
            throw new EBankingException("Date parsing error while preparing OperationHistory request for CardAccountHistory action", e.getCause().getMessage());
        }

        operationHistoryRQ.setIdList(idArray);
        operationHistoryRQ.setFromDate(fromCalendar);
        operationHistoryRQ.setToDate(toCalendar);
        operationHistoryRQ.setOperationRequestType(OperationRequestType.CARD_ACCOUNT.toString());

        return operationHistoryRQ;
    }

    @Override
    protected String processResponse(OperationHistoryRS responseObject) throws EBankingException {
        Operation[] operationArray = responseObject.getOperations();
        if (operationArray == null) {
            throw new EBankingException("Error while processing OperationHistory response for CardAccountHistory action. Operation array is null");
        }
        operations = new ArrayList(Arrays.asList(operationArray));
        return "success";
    }
}
