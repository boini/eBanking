package com.ebanking.ws.operation.factory;

import com.ebanking.ws.dao.*;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.model.operation.OperationTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 07.12.12
 * Time: 2:04
 * To change this template use File | Settings | File Templates.
 */
@Component
@Scope(value = "singleton")
public class OperationFactory {
    private OperationStatusDAO operationStatusDAO;
    private OperationTypeDAO operationTypeDAO;

    @Autowired
    public void setOperationStatusDAO(OperationStatusDAO operationStatusDAO) {
        this.operationStatusDAO = operationStatusDAO;
    }

    @Autowired
    public void setOperationTypeDAO(OperationTypeDAO operationTypeDAO) {
        this.operationTypeDAO = operationTypeDAO;
    }

    public Operation operationWithType(OperationTypeEnum operationType, OperationStatusEnum operationStatus) {

        Operation operation = new Operation();
        operation.setOperationType(
                operationTypeDAO.getOperationTypeByCode(
                operationType.getOperationType()));
        operation.setOperationStatus(
                operationStatusDAO.getOperationStatusByCode(
                operationStatus.getOperationStatus()));

        return operation;
    }
}
