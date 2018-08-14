package com.kuangclub.web.controller;

import com.kuangclub.result.ErrorException;
import com.kuangclub.result.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/exception")
    public Result exception(){
        throw new ErrorException(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @RequestMapping("/sqlException")
    public Result sqlException() throws Exception{
        throw new SQLException();
    }

    @RequestMapping("/notAuth")
    public Result notAuth(){
        return new Result(HttpStatus.NOT_ACCEPTABLE);
    }

    @RequestMapping("/notFound")
    public Result notFound(){
        return new Result(HttpStatus.NOT_FOUND);
    }
}
