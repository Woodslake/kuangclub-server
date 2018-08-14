package com.kuangclub.web.controller;

import com.kuangclub.service.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class SocketController {

    private int i = 0;

    @Autowired
    private WebSocketService webSocketService;

    @RequestMapping("/sendMessage")
    public String sendMessage(){
        try {
            webSocketService.sendInfo("i = " + i);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "sendMessage:" + i++;
    }

    @RequestMapping("/clear")
    public String clear(){
        i = 0;
        return "sendMessage:" + i++;
    }

}
