package com.kuangclub.result;

public class ErrorInfoException extends Exception {
    private ErrorInfo errorInfo;

    public ErrorInfoException(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }
}
