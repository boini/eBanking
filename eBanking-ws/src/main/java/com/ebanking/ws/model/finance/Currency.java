package com.ebanking.ws.model.finance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:16 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "CURRENCY")
public class Currency {
    @Id
    @Column(name = "CURRENCY_ID")
    private long currencyId;
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;
    @Column(name = "DESCRIPTION")
    private String currencyDescription;

    public long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyDescription() {
        return currencyDescription;
    }

    public void setCurrencyDescription(String currencyDescription) {
        this.currencyDescription = currencyDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        if (currencyId != currency.currencyId) return false;
        if (!currencyCode.equals(currency.currencyCode)) return false;
        if (currencyDescription != null ? !currencyDescription.equals(currency.currencyDescription) : currency.currencyDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (currencyId ^ (currencyId >>> 32));
        result = 31 * result + currencyCode.hashCode();
        result = 31 * result + (currencyDescription != null ? currencyDescription.hashCode() : 0);
        return result;
    }
}
