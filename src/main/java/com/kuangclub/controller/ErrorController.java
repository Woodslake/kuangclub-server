package com.kuangclub.controller;

import com.kuangclub.result.ErrorInfo;
import com.kuangclub.result.ResultBody;
import com.kuangclub.result.ResultEnum;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/error")
public class ErrorController {

    @RequestMapping("/exception")
    public ResultBody exception(){
        return new ResultBody(new ErrorInfo());
    }

    @RequestMapping("/notAuth")
    public ResultBody notAuth(){
        return new ResultBody(new ErrorInfo(ResultEnum.NOT_AUTH));
    }

    @RequestMapping("/notFound")
    public ResultBody notFound(){
        return new ResultBody(new ErrorInfo(ResultEnum.NOT_FOUND));
    }
}
