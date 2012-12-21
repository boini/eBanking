package com.ebanking.ws.operation.quartz;

import com.ebanking.ws.dao.AutoPaymentDAO;
import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.model.operation.AutoPayment;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.operation.payment.processor.PaymentOperationProcessor;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PaymentPeekerService {

    private OperationDAO operationDAO;
    private AutoPaymentDAO autoPaymentDAO;
    private PaymentOperationProcessor paymentOperationProcessor;

    @Autowired
    public void setOperationDAO(OperationDAO operationDAO) {
        this.operationDAO = operationDAO;
    }

    @Autowired
    public void setPaymentOperationProcessor(PaymentOperationProcessor paymentOperationProcessor) {
        this.paymentOperationProcessor = paymentOperationProcessor;
    }

    @Autowired
    public void setAutoPaymentDAO(AutoPaymentDAO autoPaymentDAO) {
        this.autoPaymentDAO = autoPaymentDAO;
    }

    public void execute() {
        Date date = new Date();
        List<AutoPayment> autoPayments = autoPaymentDAO.list();
        for (AutoPayment autoPayment : autoPayments) {
            if (date.after(autoPayment.getNextDate())) {
                Operation operation = autoPayment.getOperation();
                operation.setProcessingDate(date);
                operation.setOperationId(0);
                operationDAO.saveOrUpdate(operation);

                Date processingDate = operation.getProcessingDate();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(processingDate);
                calendar.add(Calendar.DATE, autoPayment.getAutoPaymentType().getPeriod());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date nextDate = calendar.getTime();

                autoPayment.setNextDate(nextDate);
                autoPaymentDAO.saveOrUpdate(autoPayment);
            }
        }

        List<Operation> operations = operationDAO.getOperationByStatus(OperationStatusEnum.NEW_OPERATION);
        if (operations != null && operations.size() > 0) {
            for (Operation operation : operations) {
                paymentOperationProcessor.process(operation);
            }
        }
    }
}
