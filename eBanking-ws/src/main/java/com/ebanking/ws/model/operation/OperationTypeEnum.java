package com.ebanking.ws.model.operation;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:52 PM
 * To change this template use File | Settings | File Templates.
 */
public enum OperationTypeEnum {
    PAYMENT("P"),
    TRANSFER_TO("TT"),
    TRANSFER_FROM("TF"),
    CHARGE("CH");

    private String operationType;

    private OperationTypeEnum(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationType() {
        return operationType;
    }
}
