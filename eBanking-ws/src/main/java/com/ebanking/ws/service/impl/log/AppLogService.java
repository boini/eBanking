package com.ebanking.ws.service.impl.log;

import com.ebanking.ws.dao.AppLogDAO;
import com.ebanking.ws.model.log.AppLog;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.AppLogRQ;
import com.ebanking.ws.service.response.AppLogRS;

import java.util.Date;
import java.util.List;

public class AppLogService extends SpringSupportService implements Service<AppLogRQ, AppLogRS> {
    private AppLogDAO appLogDAO;

    @Override
    public AppLogRS execute(AppLogRQ request) {
        appLogDAO = (AppLogDAO) getBean("appLogDAO");

        Date startDate = request.getFromDate();
        Date endDate = request.getToDate();
        String action = request.getActionSearch();
        String message = request.getMessageSearch();

        List<AppLog> appLogs = appLogDAO.list();

        AppLog[] logs = appLogs.toArray(new AppLog[appLogs.size()]);

        AppLogRS appLogRS = new AppLogRS();
        appLogRS.setSuccess(true);
        appLogRS.setLogs(logs);

        return appLogRS;
    }
}
