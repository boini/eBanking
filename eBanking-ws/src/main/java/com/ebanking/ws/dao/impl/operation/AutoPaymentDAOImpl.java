package com.ebanking.ws.dao.impl.operation;

import com.ebanking.ws.dao.AutoPaymentDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.operation.AutoPayment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 8:52 AM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class AutoPaymentDAOImpl extends CommonDAOImpl implements AutoPaymentDAO {
    @Override
    public AutoPayment getByOperationId(long operationId) {
        List<AutoPayment> autoPayments =
                currentSession().createQuery("from AutoPayment as ap where ap.operation.operationId = ?")
                        .setLong(0, operationId)
                        .list();
        if (autoPayments != null && autoPayments.size() > 0) {
            return autoPayments.get(0);
        }
        return null;
    }

    @Override
    public void saveOrUpdate(AutoPayment autoPayment) {
        currentSession().saveOrUpdate(autoPayment);
    }

    @Override
    public List list() {
        return currentSession().createCriteria(AutoPayment.class).list();
    }

    @Override
    public void delete(AutoPayment autoPayment) {
        currentSession().delete(autoPayment);
    }
}
