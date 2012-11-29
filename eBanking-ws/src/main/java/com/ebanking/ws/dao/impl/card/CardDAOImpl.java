package com.ebanking.ws.dao.impl.card;

import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/29/12
 * Time: 11:34 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class CardDAOImpl extends CommonDAOImpl implements CardDAO {
    @Override
    public List getCardsByClientId(Long id) {
        return currentSession().createQuery("from Card as card where card.cardAccount.client.clientId = ?")
                .setLong(0, id)
                .list();
    }
}
