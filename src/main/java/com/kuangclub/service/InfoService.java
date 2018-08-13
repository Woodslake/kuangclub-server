package com.kuangclub.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kuangclub.dao.*;
import com.kuangclub.domain.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(InfoService.class);

    private final int PAGE_SIZE = 5;

    @Autowired
    private InfoMapper infoMapper;

    @Autowired
    private InfoHeadlineMapper infoHeadlineMapper;

    @Autowired
    private InfoRecommendMapper infoRecommendMapper;

    @Autowired
    private InfoFocusMapper infoFocusMapper;

    @Autowired
    private InfoPolicyMapper infoPolicyMapper;

    @Autowired
    private InfoPopularMapper infoPopularMapper;

    public List<Info> getInfoList(){
        return infoMapper.getInfoList();
    }

    public Object getInfoTypeList(String type, int page){
        switch (type){
            case "headline":
                return getInfoHeadlineList(page);
            case "recommend":
                return getInfoRecommendList(page);
            case "focus":
                return getInfoFocusList(page);
            case "policy":
                return getInfoPolicyList(page);
            case "popular":
                return getInfoPopularList(page);
            default:
                return null;
        }
    }

    private PageInfo<InfoHeadline> getInfoHeadlineList(int page){
        PageHelper.startPage(page, PAGE_SIZE);
        List<InfoHeadline> infoHeadlineList = infoHeadlineMapper.getInfoHeadlineList();
        PageInfo<InfoHeadline> pageInfo = new PageInfo<>(infoHeadlineList);
        return pageInfo;
    }

    private List<InfoRecommend> getInfoRecommendList(int page){
        PageHelper.startPage(page, PAGE_SIZE);
        return infoRecommendMapper.getInfoRecommendList();
    }

    private List<InfoFocus> getInfoFocusList(int page){
        PageHelper.startPage(page, PAGE_SIZE);
        return infoFocusMapper.getInfoFocusList();
    }

    private List<InfoPolicy> getInfoPolicyList(int page){
        PageHelper.startPage(page, PAGE_SIZE);
        return infoPolicyMapper.getInfoPolicyList();
    }

    private List<InfoPopular> getInfoPopularList(int page){
        PageHelper.startPage(page, PAGE_SIZE);
        return infoPopularMapper.getInfoPopularList();
    }

}
