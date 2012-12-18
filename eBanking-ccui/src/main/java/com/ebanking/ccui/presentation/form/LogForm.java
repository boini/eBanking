package com.ebanking.ccui.presentation.form;

import com.ebanking.ccui.model.log.AppLog;

import java.util.List;

public class LogForm {
    private List<AppLog> logs;

    public List<AppLog> getLogs() {
        return logs;
    }

    public void setLogs(List<AppLog> logs) {
        this.logs = logs;
    }
}
