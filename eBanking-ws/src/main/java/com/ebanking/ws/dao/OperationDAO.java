package com.ebanking.ws.dao;

import com.ebanking.ws.model.operation.Operation;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 9:20 PM
 * To change this template use File | Settings | File Templates.
 */
public interface OperationDAO {
    void saveOrUpdate(Operation opearation);
}
