package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.AppLogDAO;
import com.ebanking.ws.model.AppLog;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class AppLogDAOImpl extends CommonDAOImpl implements AppLogDAO {
    @Override
    public void saveOrUpdate(AppLog appLog) {
        currentSession().saveOrUpdate(appLog);
    }
}
