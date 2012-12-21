package com.ebanking.ws.model.operation;

import javax.persistence.*;

@Entity
@Table(name = "AUTOPAYMENT_TYPE")
public class AutoPaymentType {
    @Id
    @Column(name = "AUTOPAYMENT_TYPE_ID")
    @GeneratedValue
    private long autoPaymentTypeId;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "PERIOD")
    private int period;

    public long getAutoPaymentTypeId() {
        return autoPaymentTypeId;
    }

    public void setAutoPaymentTypeId(long autoPaymentTypeId) {
        this.autoPaymentTypeId = autoPaymentTypeId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
}
