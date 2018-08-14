package com.kuangclub.result;

import org.springframework.http.HttpStatus;

public class ErrorException extends RuntimeException {
    private HttpStatus httpStatus;

    public ErrorException(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }
}
