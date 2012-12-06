package com.ebanking.ws.dao;

import com.ebanking.ws.model.account.Corporation;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/5/12
 * Time: 10:07 PM
 * To change this template use File | Settings | File Templates.
 */
public interface CorporationDAO {
    Corporation getCorporationByName(String name);
}
