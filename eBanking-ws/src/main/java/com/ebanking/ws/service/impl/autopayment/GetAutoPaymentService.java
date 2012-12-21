package com.ebanking.ws.service.impl.autopayment;

import com.ebanking.ws.dao.AutoPaymentDAO;
import com.ebanking.ws.model.operation.AutoPayment;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.GetAutoPaymentRQ;
import com.ebanking.ws.service.response.GetAutoPaymentRS;

import java.util.List;

import static com.ebanking.ws.utils.CardUtils.hideCardInfo;

public class GetAutoPaymentService extends SpringSupportService implements Service<GetAutoPaymentRQ, GetAutoPaymentRS> {
    private AutoPaymentDAO autoPaymentDAO;

    @Override
    public GetAutoPaymentRS execute(GetAutoPaymentRQ request) {
        autoPaymentDAO = (AutoPaymentDAO) getBean("autoPaymentDAO");

        long operationId = request.getOperationId();
        GetAutoPaymentRS getAutoPaymentRS = new GetAutoPaymentRS();

        if (operationId != 0) {
            AutoPayment autoPayment = autoPaymentDAO.getByOperationId(operationId);

            getAutoPaymentRS.setAutoPayment(autoPayment);
            getAutoPaymentRS.setSuccess(true);

            if (autoPayment != null) {
                Operation operation = autoPayment.getOperation();
                hideCardInfo(operation.getCard());
                operation.getCard().getCardAccount().setCards(null);
                if (operation.getContractorCard() != null) {
                    operation.getContractorCard().getCardAccount().setCards(null);
                }
                if (operation.getContractorAccount() != null) {
                    operation.getContractorAccount().getCorporation().setBankAccountList(null);
                }
            }
        } else {
            List<AutoPayment> autoPayments = autoPaymentDAO.list();
            for (AutoPayment autoPayment : autoPayments) {
                Operation operation = autoPayment.getOperation();
                hideCardInfo(operation.getCard());
                operation.getCard().getCardAccount().setCards(null);
                if (operation.getContractorCard() != null) {
                    operation.getContractorCard().getCardAccount().setCards(null);
                }
                if (operation.getContractorAccount() != null) {
                    operation.getContractorAccount().getCorporation().setBankAccountList(null);
                }
            }

            AutoPayment[] payments = autoPayments.toArray(new AutoPayment[autoPayments.size()]);

            getAutoPaymentRS.setAutoPayments(payments);
            getAutoPaymentRS.setSuccess(true);
        }

        return getAutoPaymentRS;
    }
}
