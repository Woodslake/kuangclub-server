package com.kuangclub.dao;

import com.kuangclub.domain.InfoHeadline;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoHeadlineMapper {
    int insert(InfoHeadline record);

    int insertSelective(InfoHeadline record);

    List<InfoHeadline> getInfoHeadlineList();
}