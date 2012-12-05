package com.ebanking.ws.dao.impl.account;

import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.dao.impl.CorporationDAO;
import com.ebanking.ws.model.account.Corporation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class CorporationDAOImpl extends CommonDAOImpl implements CorporationDAO {
    @Override
    public Corporation getCorporationByName(String name) {
        List<Corporation> corporationList =
                currentSession().createQuery("from Corporation as corporation where corporation.corporationName = ?")
                .setString(0, name)
                .list();
        if (corporationList != null && corporationList.size() > 0) {
            return corporationList.get(0);
        }
        return null;
    }
}
