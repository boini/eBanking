package com.ebanking.ws.dao;

import com.ebanking.ws.model.operation.AutoPaymentType;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public interface AutoPaymentTypeDAO {
    AutoPaymentType getByType(String type);
}
