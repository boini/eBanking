package com.ebanking.ws.service.impl.transfer;

import com.ebanking.ws.dao.*;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.card.Card;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.model.operation.OperationTypeEnum;
import com.ebanking.ws.operation.factory.OperationFactory;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.impl.transfer.validator.TransferValidator;
import com.ebanking.ws.service.request.TransferRQ;
import com.ebanking.ws.service.response.TransferRS;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional
public class TransferService extends SpringSupportService implements Service<TransferRQ, TransferRS> {

    private OperationDAO operationDAO;
    private CardDAO cardDAO;
    private OperationFactory operationFactory;

    @Override
    public TransferRS execute(TransferRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        operationDAO = (OperationDAO) getBean("operationDAO");
        cardDAO = (CardDAO) getBean("cardDAO");
        operationFactory = (OperationFactory) getBean("operationFactoryBean");

        logger.logRQRS(request, TransferService.class);

        TransferRS transferRS = new TransferRS();

        if (TransferValidator.validate(request)) {
            double amount = request.getAmount();
            Client client = request.getClient();
            long fromCardId = request.getFromCardId();
            long toCardId = request.getToCardId();
            Date processingDate = request.getDate();

            Operation operation = operationFactory.operationWithType(
                    OperationTypeEnum.TRANSFER_TO, OperationStatusEnum.NEW_OPERATION);

            List<Card> clientCards = cardDAO.getCardsByClientId(client.getClientId());
            for (Card card : clientCards) {
                if (card.getCardId() == fromCardId) {
                    operation.setCard(card);
                    break;
                }
            }

            Card contractorCard = cardDAO.getById(toCardId);
            operation.setContractorCard(contractorCard);
            operation.setTransactionAmount(amount);
            operation.setProcessingDate(processingDate);

            operationDAO.saveOrUpdate(operation);

            transferRS.setSuccess(true);
        } else {
            transferRS.setSuccess(false);
            transferRS.setException("Bad request");
        }

        logger.logRQRS(transferRS, TransferService.class);

        return transferRS;
    }
}
