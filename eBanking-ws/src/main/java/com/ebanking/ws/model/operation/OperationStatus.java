package com.ebanking.ws.model.operation;

import javax.persistence.*;

@Entity
@Table(name = "OPERATION_STATUS")
public class OperationStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OPERATION_STATUS_ID")
    private long operationStatusId;

    @Column(name = "OPERATION_STATUS")
    private String operationStatus;

    @Column(name = "DESCRIPTION")
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
