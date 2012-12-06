package com.ebanking.ws.dao.impl.operation;

import com.ebanking.ws.dao.OperationStatusDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.operation.OperationStatus;
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
public class OperationStatusDAOImpl extends CommonDAOImpl implements OperationStatusDAO {
    @Override
    public OperationStatus getOperationStatusByCode(String code) {
        List<OperationStatus> operationStatuses =
                currentSession().createQuery("from OperationStatus as os where os.operationStatus = ?")
                        .setString(0, code)
                        .list();
        if (operationStatuses != null && operationStatuses.size() > 0) {
            return operationStatuses.get(0);
        }
        return null;
    }
}
