package com.ebanking.ws.service.impl.saveAutopayment;

import com.ebanking.ws.dao.AutoPaymentDAO;
import com.ebanking.ws.dao.AutoPaymentTypeDAO;
import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.model.operation.AutoPayment;
import com.ebanking.ws.model.operation.AutoPaymentType;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.SaveAutoPaymentRQ;
import com.ebanking.ws.service.response.SaveAutoPaymentRS;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SaveAutoPaymentService extends SpringSupportService implements Service<SaveAutoPaymentRQ, SaveAutoPaymentRS> {
    private OperationDAO operationDAO;
    private AutoPaymentTypeDAO autoPaymentTypeDAO;
    private AutoPaymentDAO autoPaymentDAO;

    @Override
    public SaveAutoPaymentRS execute(SaveAutoPaymentRQ request) {
        operationDAO = (OperationDAO) getBean("operationDAO");
        autoPaymentTypeDAO = (AutoPaymentTypeDAO) getBean("autoPaymentTypeDAO");
        autoPaymentDAO = (AutoPaymentDAO) getBean("autoPaymentDAO");

        long operationId = request.getOperationId();
        String period = request.getPeriod();
        AutoPayment autoPayment = request.getAutoPayment();

        if (autoPayment != null && "R".equals(period)) {
            autoPaymentDAO.delete(autoPayment);
        } else {
            AutoPaymentType autoPaymentType = autoPaymentTypeDAO.getByType(period);

            if (autoPayment == null) {
                Operation operation = operationDAO.getById(operationId);

                AutoPayment autoPaymentNew = new AutoPayment();
                autoPaymentNew.setOperation(operation);
                autoPaymentNew.setAutoPaymentType(autoPaymentType);

                Date date = operation.getProcessingDate();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.DATE, autoPaymentType.getPeriod());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date nextDate = calendar.getTime();

                autoPaymentNew.setNextDate(nextDate);
                autoPaymentDAO.saveOrUpdate(autoPaymentNew);
            } else {
                autoPayment.setAutoPaymentType(autoPaymentType);

                Date date = new Date();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                calendar.add(Calendar.DATE, autoPaymentType.getPeriod());
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date nextDate = calendar.getTime();

                autoPayment.setNextDate(nextDate);

                autoPaymentDAO.saveOrUpdate(autoPayment);
            }
        }

        SaveAutoPaymentRS saveAutoPaymentRS = new SaveAutoPaymentRS();
        saveAutoPaymentRS.setSuccess(true);

        return saveAutoPaymentRS;
    }
}
