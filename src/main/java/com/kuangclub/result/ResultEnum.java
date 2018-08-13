package com.kuangclub.result;

public enum ResultEnum {

    SUCCESS(200, "success"),
    EXCEPTION(-1, "system error"),
    NOT_AUTH(-5, "not auth"),
    NOT_FOUND(-7, "service not found"),
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
