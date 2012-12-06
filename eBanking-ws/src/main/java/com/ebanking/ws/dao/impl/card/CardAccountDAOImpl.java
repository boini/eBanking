package com.ebanking.ws.dao.impl.card;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.card.CardAccount;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 6:27 AM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class CardAccountDAOImpl extends CommonDAOImpl implements CardAccountDAO {
    @Override
    public List listByClientId(Long id) {
        return currentSession().createQuery("from CardAccount as cardAccount where cardAccount.client.clientId = ?")
                .setLong(0, id)
                .list();
    }

    @Override
    public CardAccount getById(Long id) {
        return (CardAccount) currentSession().get(CardAccount.class, id);
    }

    @Override
    public void saveOrUpdate(CardAccount cardAccount) {
        currentSession().saveOrUpdate(cardAccount);
    }
}
