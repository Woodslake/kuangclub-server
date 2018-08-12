package com.kuangclub.dao;

import com.kuangclub.domain.InfoType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoTypeMapper {
    int insert(InfoType record);

    int insertSelective(InfoType record);

    List<InfoType> getInfoTypeList();
}