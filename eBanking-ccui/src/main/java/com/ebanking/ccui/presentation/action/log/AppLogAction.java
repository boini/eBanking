package com.ebanking.ccui.presentation.action.log;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.log.AppLog;
import com.ebanking.ccui.presentation.action.BaseRQRSAction;
import com.ebanking.ccui.presentation.form.LogForm;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.AppLogRQ;
import com.ebanking.ccui.service.response.AppLogRS;
import com.ebanking.ccui.session.HttpSessionUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppLogAction extends BaseRQRSAction<AppLogRQ, AppLogRS> {
    @Autowired
    private LogForm logForm;

    @Override
    @Autowired
    @Qualifier(value = "appLogService")
    public void setServiceClient(ServiceClient<AppLogRQ, AppLogRS> serviceClient) {
        this.serviceClient = serviceClient;
    }

    @Override
    protected AppLogRQ prepareRequest() throws EBankingException {
        AppLogRQ appLogRQ = new AppLogRQ();
        return appLogRQ;
    }

    @Override
    protected String processResponse(AppLogRS responseObject) throws EBankingException {
        AppLog[] appLogs = responseObject.getLogs();
        List<AppLog> logs = new ArrayList<AppLog>(Arrays.asList(appLogs));
        logForm.setLogs(logs);
        HttpSessionUtil.setLogForm(logForm);

        return "success";
    }
}
