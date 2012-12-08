package com.ebanking.ws.service.impl.info;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.CardOperationHistoryRQ;
import com.ebanking.ws.service.response.CardOperationHistoryRS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CardOperationHistoryService extends SpringSupportService implements Service<CardOperationHistoryRQ, CardOperationHistoryRS> {
    private OperationDAO operationDAO;

    @Override
    public CardOperationHistoryRS execute(CardOperationHistoryRQ request) {
        operationDAO = (OperationDAO) getBean("operationDAO");
        logger = (RQRSLogger) getBean("RQRSLogger");

        long[] cardIdList = request.getCardIdList();
        Date startDate = request.getFromDate();
        Date endDate = request.getToDate();

        CardOperationHistoryRS cardOperationHistoryRS = new CardOperationHistoryRS();

        List<Operation> operations = new ArrayList<Operation>();

        for (int index = 0; index < cardIdList.length; ++index) {
            operations.addAll(operationDAO.getCardOperations(cardIdList[index], startDate, endDate));
        }

        for (Operation operation : operations) {
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
            cardOperationHistoryRS.setOperations(operationArray);
        }

        return cardOperationHistoryRS;
    }
}
