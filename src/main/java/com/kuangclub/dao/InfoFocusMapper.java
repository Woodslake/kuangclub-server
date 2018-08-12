package com.kuangclub.dao;

import com.kuangclub.domain.InfoFocus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoFocusMapper {
    int insert(InfoFocus record);

    int insertSelective(InfoFocus record);

    List<InfoFocus> getInfoFocusList();
}