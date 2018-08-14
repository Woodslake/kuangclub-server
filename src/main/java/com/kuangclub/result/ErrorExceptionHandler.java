package com.kuangclub.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(ErrorExceptionHandler.class);

    @ExceptionHandler(value = ErrorException.class)
    public Result handleErrorInfoException(ErrorException e){
        logger.error(e.getMessage(), e);
        HttpStatus httpStatus = e.getHttpStatus();
        return new Result(httpStatus);
    }

}
