package com.ebanking.ws.service.impl.info;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.OperationHistoryRQ;
import com.ebanking.ws.service.response.OperationHistoryRS;
import com.ebanking.ws.utils.CardUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.ebanking.ws.utils.CardUtils.hideCardInfo;

public class OperationHistoryService extends SpringSupportService implements Service<OperationHistoryRQ, OperationHistoryRS> {
    private OperationDAO operationDAO;

    @Override
    public OperationHistoryRS execute(OperationHistoryRQ request) {
        operationDAO = (OperationDAO) getBean("operationDAO");
        logger = (RQRSLogger) getBean("RQRSLogger");

        long[] idList = request.getIdList();
        String operationRequestTypeStr = request.getOperationRequestType();
        OperationRequestType operationRequestType = OperationRequestType.valueOf(operationRequestTypeStr.toUpperCase());

        OperationHistoryRS operationHistoryRS = new OperationHistoryRS();
        List<Operation> operations = new ArrayList<Operation>();

        switch (operationRequestType) {
            case CARD:
                Date startDate = request.getFromDate();
                Date endDate = request.getToDate();
                for (int index = 0; index < idList.length; ++index) {
                    operations.addAll(operationDAO.getCardOperations(idList[index], startDate, endDate));
                }
                break;
            case CARD_ACCOUNT:
                startDate = request.getFromDate();
                endDate = request.getToDate();
                for (int index = 0; index < idList.length; ++index) {
                    operations.addAll(operationDAO.getCardAccountOperations(idList[index], startDate, endDate));
                }
                break;
            case CLIENT:
                for (int index = 0; index < idList.length; ++index) {
                    operations.addAll(operationDAO.getAccountOperations(idList[index]));
                }
        }

        for (Operation operation : operations) {
            hideCardInfo(operation.getCard());
            operation.getCard().getCardAccount().setCards(null);
            if (operation.getContractorCard() != null) {
                operation.getContractorCard().getCardAccount().setCards(null);
            }
            if (operation.getContractorAccount() != null) {
                operation.getContractorAccount().getCorporation().setBankAccountList(null);
            }
        }

        if (operations.size() > 0) {
            Operation[] operationArray = operations.toArray(new Operation[operations.size()]);
            operationHistoryRS.setOperations(operationArray);
        }

        return operationHistoryRS;
    }
}
