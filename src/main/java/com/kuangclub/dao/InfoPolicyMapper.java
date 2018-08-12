package com.kuangclub.dao;

import com.kuangclub.domain.InfoPolicy;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoPolicyMapper {
    int insert(InfoPolicy record);

    int insertSelective(InfoPolicy record);

    List<InfoPolicy> getInfoPolicyList();
}