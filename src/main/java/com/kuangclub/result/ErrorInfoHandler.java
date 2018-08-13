package com.kuangclub.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ErrorInfoHandler {

    @ExceptionHandler(value = ErrorInfoException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request, ErrorInfoException exception){
        ErrorInfo errorInfo = exception.getErrorInfo();
        ResultBody resultBody = new ResultBody(errorInfo);
        return resultBody;
    }
}
