package com.kuangclub.result;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class Result implements Serializable {
    private int code;
    private String message;
    private Object data;

    public Result(Object data) {
        this(HttpStatus.OK, data);
    }

    public Result(HttpStatus httpStatus){
        this(httpStatus, null);
    }

    public Result(HttpStatus httpStatus, Object data){
        this.code = httpStatus.value();
        this.message = httpStatus.getReasonPhrase();
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
