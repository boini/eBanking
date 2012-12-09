package com.ebanking.cui.presentation.form;

import com.ebanking.cui.model.operation.Operation;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/9/12
 * Time: 8:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientOpertaionHistoryForm {
    private Operation[] operations;

    public Operation[] getOperations() {
        return operations;
    }

    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }
}
