package com.ebanking.ws.dao;

import com.ebanking.ws.model.card.CardAccount;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 6:25 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CardAccountDAO {
    List listByClientId(Long id);
    CardAccount getById(Long id);
}
