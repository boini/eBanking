package com.ebanking.ccui.presentation.action.bankAccount;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.operation.Operation;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.client.impl.history.OperationRequestType;
import com.ebanking.ccui.service.request.OperationHistoryRQ;
import com.ebanking.ccui.service.response.OperationHistoryRS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BankAccountOperationHistoryAction extends BaseRQRSAction<OperationHistoryRQ, OperationHistoryRS> {
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
    @Qualifier(value = "operationHistoryService")
    public void setServiceClient(ServiceClient<OperationHistoryRQ, OperationHistoryRS> serviceClient) {
        this.serviceClient = serviceClient;
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
        operationHistoryRQ.setOperationRequestType(OperationRequestType.BANK_ACCOUNT.toString());

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
