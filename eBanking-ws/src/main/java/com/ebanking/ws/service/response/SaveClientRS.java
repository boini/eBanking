package com.ebanking.ws.service.response;

public class SaveClientRS {
    private boolean success;
    private String exception;

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

    @Override
    public String toString() {
        return "SaveClientRS{" +
                "success=" + success +
                ", exception='" + exception + '\'' +
                '}';
    }
}
