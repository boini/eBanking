package com.ebanking.ws.model.operation;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:49 PM
 * To change this template use File | Settings | File Templates.
 */
public enum OperationStatusEnum {
    COMPLETED_OPERATION("C"),
    NEW_OPERATION("N"),
    ERROR_OPERATION("E"),
    PROCESSING_OPERATION("P");

    private String operationStatus;

    private OperationStatusEnum(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getOperationStatus() {
        return operationStatus;
    }
}
