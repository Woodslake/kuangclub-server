package com.kuangclub.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
    Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/trace")
    public String trace(String message){
        logger.trace(message);
        return String.format("trace: %s", message);
    }

    @RequestMapping("/debug")
    public String debug(String message){
        logger.debug(message);
        return String.format("debug: %s", message);
    }

    @RequestMapping("/info")
    public String info(String message){
        logger.info(message);
        return String.format("info: %s", message);
    }

    @RequestMapping("/warn")
    public String warn(String message){
        logger.warn(message);
        return String.format("warn: %s", message);
    }

    @RequestMapping("/error")
    public String error(String message){
        logger.error(message);
        return String.format("error: %s", message);
    }

}
