package com.ebanking.ws.dao.impl.card;

import com.ebanking.ws.dao.CardDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.card.Card;
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

    @Override
    public Card getById(long cardId) {
        return (Card) currentSession().get(Card.class, cardId);
    }

    @Override
    public void saveOrUpdate(Card card) {
        currentSession().saveOrUpdate(card);
    }
}
