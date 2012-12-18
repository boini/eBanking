package com.ebanking.ws.dao;

import com.ebanking.ws.model.card.Card;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/29/12
 * Time: 11:31 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CardDAO {
    List getCardsByClientId(Long id);
    Card getById(long cardId);
    void saveOrUpdate(Card card);
}
