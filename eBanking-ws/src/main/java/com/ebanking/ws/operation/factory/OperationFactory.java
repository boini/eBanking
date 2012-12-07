package com.ebanking.ws.operation.factory;

import com.ebanking.ws.dao.*;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import com.ebanking.ws.model.operation.OperationTypeEnum;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 07.12.12
 * Time: 2:04
 * To change this template use File | Settings | File Templates.
 */
public class OperationFactory {

    @Autowired
    private OperationStatusDAO operationStatusDAO;
    @Autowired
    private OperationTypeDAO operationTypeDAO;

    private static OperationFactory instance;

    private OperationFactory() {}

    public static OperationFactory getSingleton() {
        if (instance == null) {
            instance = new OperationFactory();
        }
        return instance;
    }

    public Operation operationWithType(OperationTypeEnum operationType) {

        Operation operation = new Operation();
        operation.setOperationType(operationTypeDAO.getOperationTypeByCode(operationType.getOperationType()));
        operation.setOperationStatus(operationStatusDAO.getOperationStatusByCode(OperationStatusEnum.NEW_OPERATION.getOperationStatus()));

        return operation;
    }
}
