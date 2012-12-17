package com.ebanking.ws.service.response;

import com.ebanking.ws.model.operation.Operation;

import java.util.Arrays;

public class OperationHistoryRS {
    private Operation[] operations;

    public Operation[] getOperations() {
        return operations;
    }

    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }

    @Override
    public String toString() {
        return "OperationHistoryRS{" +
                "operations=" + (operations == null ? null : Arrays.asList(operations)) +
                '}';
    }
}
