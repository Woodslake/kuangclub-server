package com.kuangclub.result;

public class ErrorInfo {
    private int code;
    private String message;

    public ErrorInfo() {
        this(ResultEnum.UNKNOWN_ERROR);
    }

    public ErrorInfo(ResultEnum resultEnum){
        this(resultEnum.getCode(), resultEnum.getMessage());
    }

    private ErrorInfo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
