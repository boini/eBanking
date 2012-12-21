package com.ebanking.ws.dao.impl.operation;

import com.ebanking.ws.dao.AutoPaymentTypeDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.operation.AutoPaymentType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AutoPaymentTypeDAOImpl extends CommonDAOImpl implements AutoPaymentTypeDAO {
    @Override
    public AutoPaymentType getByType(String type) {
        List<AutoPaymentType> autoPayments =
                currentSession().createQuery("from AutoPaymentType as ap where ap.type = ?")
                        .setString(0, type)
                        .list();
        if (autoPayments != null && autoPayments.size() > 0) {
            return autoPayments.get(0);
        }
        return null;
    }
}
