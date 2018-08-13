package com.kuangclub.result;

public enum ResultEnum {

    SUCCESS(200, "success"),
    SYSTEM_ERROR(-1, "system error"),
    UNKNOWN_ERROR(-1000, "unknown error"),
    NOT_AUTH(-1001, "not auth"),
    NOT_FOUND(-1002, "service not found"),
//    PARAM_NULL,
//    PARAM_ERROR,
    ;

    private int code;
    private String message;

    ResultEnum(int code, String message){
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
