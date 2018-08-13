package com.kuangclub.controller;

import com.kuangclub.result.ResultBody;
import com.kuangclub.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @GetMapping(value = "/getInfoList")
    public ResultBody getInfoList(){
        return new ResultBody(infoService.getInfoList());
    }

    @GetMapping(value = "/getInfoTypeList")
    public ResultBody getInfoList(String type, @RequestParam(defaultValue = "0") int page){
        return new ResultBody(infoService.getInfoTypeList(type, page));
    }
}
