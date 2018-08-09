package com.kuangclub.controller;

import com.kuangclub.result.ResultBody;
import com.kuangclub.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @RequestMapping("/getInfoList")
    public ResultBody getInfoList(){
        return new ResultBody(infoService.getInfoList());
    }

    @RequestMapping("/getHeadlineList")
    public ResultBody getHeadlineList(){
        return new ResultBody(infoService.getHeadlineList());
    }

    @RequestMapping("/getApplicationList")
    public ResultBody getApplicationList(){
        return new ResultBody(infoService.getApplicationList());
    }

    @RequestMapping("/getFocusList")
    public ResultBody getFocusList(){
        return new ResultBody(infoService.getFocusList());
    }

    @RequestMapping("/getPolicyList")
    public ResultBody getPolicyList(){
        return new ResultBody(infoService.getPolicyList());
    }

    @RequestMapping("/getPopularList")
    public ResultBody getPopularList(){
        return new ResultBody(infoService.getPopularList());
    }

}
