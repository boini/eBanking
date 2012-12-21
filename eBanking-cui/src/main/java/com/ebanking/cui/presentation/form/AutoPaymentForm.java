package com.ebanking.cui.presentation.form;

import com.ebanking.cui.model.operation.AutoPayment;
import com.ebanking.cui.model.operation.Operation;
import org.apache.commons.collections.KeyValue;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 9:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class AutoPaymentForm {
    private AutoPayment autoPayment;
    private Operation operation;
    private AutoPayment[] autoPayments;

    public AutoPayment[] getAutoPayments() {
        return autoPayments;
    }

    public void setAutoPayments(AutoPayment[] autoPayments) {
        this.autoPayments = autoPayments;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public AutoPayment getAutoPayment() {
        return autoPayment;
    }

    public void setAutoPayment(AutoPayment autoPayment) {
        this.autoPayment = autoPayment;
    }

    public AutoPayment getById(long id) {
        for (AutoPayment ap : autoPayments) {
            if (ap.getAutoPaymentId() == id) {
                return ap;
            }
        }
        return null;
    }
}
