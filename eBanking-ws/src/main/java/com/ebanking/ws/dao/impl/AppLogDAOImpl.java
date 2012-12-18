package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.AppLogDAO;
import com.ebanking.ws.model.log.AppLog;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AppLogDAOImpl extends CommonDAOImpl implements AppLogDAO {
    @Override
    public void saveOrUpdate(AppLog appLog) {
        currentSession().saveOrUpdate(appLog);
    }

    @Override
    public List<AppLog> list() {
        return currentSession().createCriteria(AppLog.class).list();
    }
}
