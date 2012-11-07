package com.ebanking.cui.model.operation;

public class OperationStatus {
    private long operationStatusId;
    private String operationStatus;
    private String description;

    public long getOperationStatusId() {
        return operationStatusId;
    }

    public void setOperationStatusId(long operationStatusId) {
        this.operationStatusId = operationStatusId;
    }

    public String getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
