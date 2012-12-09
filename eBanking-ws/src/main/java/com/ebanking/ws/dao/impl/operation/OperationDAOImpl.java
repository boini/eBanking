package com.ebanking.ws.dao.impl.operation;

import com.ebanking.ws.dao.OperationDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.operation.Operation;
import com.ebanking.ws.model.operation.OperationStatus;
import com.ebanking.ws.model.operation.OperationStatusEnum;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

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

    @Override
    public List getOperationByStatus(OperationStatusEnum operationStatus) {
        List<Operation> operations =
                currentSession().createQuery("from Operation as op where op.operationStatus.operationStatus = ?")
                        .setString(0, operationStatus.getOperationStatus())
                        .setMaxResults(2)
                        .list();
        return operations;
    }

    @Override
    public List getCardOperations(long cardId, Date fromDate, Date toDate) {
        Criteria criteria = currentSession().createCriteria(Operation.class);

        criteria.add(Restrictions.eq("card.cardId", cardId));
        criteria.add(Restrictions.between("processingDate", fromDate, toDate));

        List<Operation> operations = criteria.list();

        return operations;
    }
}
