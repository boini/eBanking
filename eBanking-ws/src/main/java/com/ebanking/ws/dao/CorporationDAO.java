package com.ebanking.ws.dao;

import com.ebanking.ws.model.account.Corporation;

import java.util.List;

public interface CorporationDAO {
    Corporation getCorporationByName(String name);
    List<Corporation> list();
    Corporation getById(long id);
}
