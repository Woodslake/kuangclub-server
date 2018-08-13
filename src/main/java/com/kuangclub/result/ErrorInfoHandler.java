package com.kuangclub.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorInfoHandler {

    @ExceptionHandler(value = ErrorInfoException.class)
    public ResultBody handleException(Exception e){
        if(e instanceof ErrorInfoException){
            ErrorInfoException errorInfoException = (ErrorInfoException) e;
            ErrorInfo errorInfo = errorInfoException.getErrorInfo();
            return new ResultBody(errorInfo);
        }else{
            e.printStackTrace();
            return new ResultBody(new ErrorInfo(ResultEnum.SYSTEM_ERROR));
        }
    }
}
