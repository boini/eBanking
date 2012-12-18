package com.ebanking.ws.dao;

import com.ebanking.ws.model.log.AppLog;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/6/12
 * Time: 10:22 PM
 * To change this template use File | Settings | File Templates.
 */
public interface AppLogDAO {
    void saveOrUpdate(AppLog appLog);
    List<AppLog> list();
}
