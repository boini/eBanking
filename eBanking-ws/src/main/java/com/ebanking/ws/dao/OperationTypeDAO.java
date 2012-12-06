package com.ebanking.ws.dao;

import com.ebanking.ws.model.operation.OperationStatus;
import com.ebanking.ws.model.operation.OperationType;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface OperationTypeDAO {
    OperationType getOperationTypeByCode(String code);
}
