package com.ebanking.ws.service.response;

import com.ebanking.ws.model.operation.Operation;

public class CardOperationHistoryRS {
    private Operation[] operations;

    public Operation[] getOperations() {
        return operations;
    }

    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }
}
