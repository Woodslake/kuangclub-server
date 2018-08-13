package com.kuangclub.controller;

import com.kuangclub.result.ErrorInfo;
import com.kuangclub.result.ErrorInfoException;
import com.kuangclub.result.ResultBody;
import com.kuangclub.result.ResultEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/errorInfo")
    public ResultBody errorInfo(){
        return new ResultBody(new ErrorInfo(ResultEnum.NOT_FOUND));
    }

    @RequestMapping("/exception")
    public ResultBody exception() throws Exception{
        throw new ErrorInfoException(new ErrorInfo());
    }
}
