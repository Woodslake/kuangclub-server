package com.kuangclub.dao;

import com.kuangclub.domain.InfoPopular;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoPopularMapper {
    int insert(InfoPopular record);

    int insertSelective(InfoPopular record);

    List<InfoPopular> getInfoPopularList();
}