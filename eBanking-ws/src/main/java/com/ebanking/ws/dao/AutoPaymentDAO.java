package com.ebanking.ws.dao;

import com.ebanking.ws.model.operation.AutoPayment;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 8:51 AM
 * To change this template use File | Settings | File Templates.
 */
public interface AutoPaymentDAO {
    AutoPayment getByOperationId(long operationId);
    void saveOrUpdate(AutoPayment autoPayment);
    List list();
    void delete(AutoPayment autoPayment);
}
