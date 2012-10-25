package com.ebanking.ws.model.finance;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 10/25/12
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
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
}
