package com.ebanking.ws.dao.impl.operation;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.operation.Operation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class OperationDAOImpl extends CommonDAOImpl implements OperationDAO {
    @Override
    public void saveOrUpdate(Operation operation) {
        currentSession().saveOrUpdate(operation);
    }
}
