package com.ebanking.ws.dao.impl.card;

import com.ebanking.ws.dao.CardTypeDAO;
import com.ebanking.ws.dao.impl.CommonDAOImpl;
import com.ebanking.ws.model.card.CardType;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class CardTypeDAOImpl extends CommonDAOImpl implements CardTypeDAO {

    @Override
    public CardType getCardTypeByName(String name) {
        List cardTypes = currentSession().createQuery("from CardType as ct where ct.cardTypeName = ?")
                .setString(0, name)
                .list();
        if (cardTypes != null && cardTypes.size() > 0) {
            return (CardType) cardTypes.get(0);
        }
        return null;
    }
}
