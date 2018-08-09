package com.kuangclub.service;

import com.kuangclub.dao.InfoMapper;
import com.kuangclub.domain.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoService.class);

    @Autowired
    private InfoMapper infoMapper;

    public List<Info> getInfoList(){
        return infoMapper.getInfoList();
    }

}
