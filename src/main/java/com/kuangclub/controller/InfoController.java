package com.kuangclub.controller;

import com.kuangclub.result.Result;
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
    public Result getInfoList(){
        return new Result(infoService.getInfoList());
    }

    @GetMapping(value = "/getInfoTypeList")
    public Result getInfoList(String type, @RequestParam(defaultValue = "0") int page){
        return new Result(infoService.getInfoTypeList(type, page));
    }
}
