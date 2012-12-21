package com.ebanking.ws.model.operation;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "AUTOPAYMENT")
public class AutoPayment {
    @Id
    @Column(name = "AUTOPAYMENT_ID")
    @GeneratedValue
    private long autoPaymentId;
    @ManyToOne
    @JoinColumn(name = "OPERATION_ID")
    private Operation operation;
    @ManyToOne
    @JoinColumn(name = "AUTOPAYMENT_TYPE_ID")
    private AutoPaymentType autoPaymentType;
    @Column(name = "NEXT_DATE")
    private Date nextDate;

    public long getAutoPaymentId() {
        return autoPaymentId;
    }

    public void setAutoPaymentId(long autoPaymentId) {
        this.autoPaymentId = autoPaymentId;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public AutoPaymentType getAutoPaymentType() {
        return autoPaymentType;
    }

    public void setAutoPaymentType(AutoPaymentType autoPaymentType) {
        this.autoPaymentType = autoPaymentType;
    }

    public Date getNextDate() {
        return nextDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
    }
}
