package com.kuangclub.result;

import java.io.Serializable;

public class ResultBody implements Serializable {
    private int code;
    private String message;
    private Object data;

    public ResultBody(Object data) {
        this(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getMessage(), data);
    }

    public ResultBody(ErrorInfo errorInfo){
        this(errorInfo.getCode(), errorInfo.getMessage(), null);
    }

    private ResultBody(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
