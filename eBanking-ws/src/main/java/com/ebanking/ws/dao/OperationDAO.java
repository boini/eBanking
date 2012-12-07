package com.ebanking.ws.dao;

import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface OperationDAO {
    void saveOrUpdate(Operation opearation);
    List getOperationByStatus(OperationStatusEnum operationStatus);
    List getCardOperations(long cardId, Date fromDate, Date toDate);
}
