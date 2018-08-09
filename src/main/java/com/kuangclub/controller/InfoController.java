package com.kuangclub.controller;

import com.kuangclub.domain.Info;
import com.kuangclub.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/getInfoList")
    public List<Info> getInfoList(){
        return infoService.getInfoList();
    }
}
