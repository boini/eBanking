package com.ebanking.ws.service.response;

public class TransferRS {
    private boolean success;
    private String exception;

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "TransferRS{" +
                "success=" + success +
                ", exception='" + exception + '\'' +
                '}';
    }
}
