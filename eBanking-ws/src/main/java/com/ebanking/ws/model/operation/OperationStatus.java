package com.ebanking.ws.model.operation;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
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
