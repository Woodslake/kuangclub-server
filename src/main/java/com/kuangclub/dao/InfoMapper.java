package com.kuangclub.dao;

import com.kuangclub.domain.Info;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoMapper {
    int insert(Info record);

    int insertSelective(Info record);

    List<Info> getInfoTypeList();
}