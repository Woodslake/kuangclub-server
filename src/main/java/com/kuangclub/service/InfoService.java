package com.kuangclub.service;

import com.kuangclub.dao.*;
import com.kuangclub.domain.*;
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

    @Autowired
    private HeadlineMapper headlineMapper;

    @Autowired
    private ApplicationMapper applicationMapper;

    @Autowired
    private FocusMapper focusMapper;

    @Autowired
    private PolicyMapper policyMapper;

    @Autowired
    private PopularMapper popularMapper;

    public List<Info> getInfoList(){
        return infoMapper.getInfoList();
    }

    public List<Headline> getHeadlineList(){
        return headlineMapper.getHeadlineList();
    }

    public List<Application> getApplicationList(){
        return applicationMapper.getApplicationList();
    }

    public List<Focus> getFocusList(){
        return focusMapper.getFocusList();
    }

    public List<Policy> getPolicyList(){
        return policyMapper.getPolicyList();
    }

    public List<Popular> getPopularList(){
        return popularMapper.getPopularList();
    }

}
