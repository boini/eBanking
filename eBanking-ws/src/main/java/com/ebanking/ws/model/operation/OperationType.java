package com.ebanking.ws.model.operation;

import javax.persistence.*;

@Entity
@Table(name = "OPERATION_TYPE")
public class OperationType {

    @Id
    @GeneratedValue
    @Column(name = "OPERATION_TYPE_ID")
    private long operationTypeId;

    @Column(name = "OPERATION_TYPE")
    private String operationType;

    @Column(name = "DESCRIPTION")
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
