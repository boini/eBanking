package com.ebanking.ws.model.operation;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class OperationType {
    private long operationTypeId;
    private String operationType;
    private String description;

    public long getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(long operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
