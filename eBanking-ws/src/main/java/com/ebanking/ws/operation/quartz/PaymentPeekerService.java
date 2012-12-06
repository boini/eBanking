package com.ebanking.ws.operation.quartz;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.operation.payment.processor.PaymentOperationProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PaymentPeekerService {

    private OperationDAO operationDAO;
    private PaymentOperationProcessor paymentOperationProcessor;

    @Autowired
    public void setOperationDAO(OperationDAO operationDAO) {
        this.operationDAO = operationDAO;
    }

    @Autowired
    public void setPaymentOperationProcessor(PaymentOperationProcessor paymentOperationProcessor) {
        this.paymentOperationProcessor = paymentOperationProcessor;
    }

    public void execute() {
        List<Operation> operations = operationDAO.getOperationByStatus(OperationStatusEnum.NEW_OPERATION);
        if (operations != null && operations.size() > 0) {
            for (Operation operation : operations) {
                paymentOperationProcessor.process(operation);
            }
        }
    }
}
