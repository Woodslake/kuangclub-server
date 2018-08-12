package com.kuangclub.dao;

import com.kuangclub.domain.InfoRecommend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoRecommendMapper {
    int insert(InfoRecommend record);

    int insertSelective(InfoRecommend record);

    List<InfoRecommend> getInfoRecommendList();
}