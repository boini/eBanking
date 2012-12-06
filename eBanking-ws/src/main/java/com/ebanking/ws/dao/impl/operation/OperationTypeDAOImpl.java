package com.ebanking.ws.dao.impl.operation;

import com.ebanking.ws.dao.OperationStatusDAO;
import com.ebanking.ws.dao.OperationTypeDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.operation.OperationStatus;
import com.ebanking.ws.model.operation.OperationType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:55 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class OperationTypeDAOImpl extends CommonDAOImpl implements OperationTypeDAO {

    @Override
    public OperationType getOperationTypeByCode(String code) {
        List<OperationType> operationTypes =
                currentSession().createQuery("from OperationType as ot where ot.operationType = ?")
                        .setString(0, code)
                        .list();
        if (operationTypes != null && operationTypes.size() > 0) {
            return operationTypes.get(0);
        }
        return null;
    }
}
