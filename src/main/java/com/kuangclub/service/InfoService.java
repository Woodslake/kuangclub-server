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
    private InfoTypeMapper infoTypeMapper;

    @Autowired
    private InfoHeadlineMapper infoHeadlineMapper;

    @Autowired
    private InfoApplicationMapper infoApplicationMapper;

    @Autowired
    private InfoFocusMapper infoFocusMapper;

    @Autowired
    private InfoPolicyMapper infoPolicyMapper;

    @Autowired
    private InfoPopularMapper infoPopularMapper;

    public List<InfoType> getInfoTypeList(){
        return infoTypeMapper.getInfoTypeList();
    }

    public Object getInfoList(String type, int page){
        switch (type){
            case "headline":
                return getInfoHeadlineList(page);
            case "recommend":
                return getInfoApplicationList(page);
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

    private List<InfoHeadline> getInfoHeadlineList(int page){
        return infoHeadlineMapper.getInfoHeadlineList();
    }

    private List<InfoApplication> getInfoApplicationList(int page){
        return infoApplicationMapper.getInfoApplicationList();
    }

    private List<InfoFocus> getInfoFocusList(int page){
        return infoFocusMapper.getInfoFocusList();
    }

    private List<InfoPolicy> getInfoPolicyList(int page){
        return infoPolicyMapper.getInfoPolicyList();
    }

    private List<InfoPopular> getInfoPopularList(int page){
        return infoPopularMapper.getInfoPopularList();
    }

}
