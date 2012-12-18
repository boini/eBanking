package com.ebanking.ws.service.response;

import com.ebanking.ws.model.log.AppLog;

public class AppLogRS {
    private AppLog[] logs;
    private boolean success;
    private String exception;

    public AppLog[] getLogs() {
        return logs;
    }

    public void setLogs(AppLog[] logs) {
        this.logs = logs;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }
}
