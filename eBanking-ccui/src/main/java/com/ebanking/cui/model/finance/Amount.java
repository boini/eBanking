package com.ebanking.cui.model.finance;

import java.math.BigDecimal;

public class Amount {
    private BigDecimal money;
    private Currency currency;

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        if (!currency.equals(amount.currency)) return false;
        if (!money.equals(amount.money)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = money.hashCode();
        result = 31 * result + currency.hashCode();
        return result;
    }
}
