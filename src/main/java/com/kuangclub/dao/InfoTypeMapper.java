package com.kuangclub.dao;

import com.kuangclub.domain.InfoType;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoTypeMapper {
    @Insert({
        "insert into info_type (code, type, ",
        "title)",
        "values (#{code,jdbcType=INTEGER}, #{type,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR})"
    })
    int insert(InfoType record);

    @InsertProvider(type=InfoTypeSqlProvider.class, method="insertSelective")
    int insertSelective(InfoType record);

    @Select("SELECT * FROM info_type")
    @Results({
            @Result(property = "code",  column = "code"),
            @Result(property = "type", column = "type"),
            @Result(property = "title", column = "title"),
    })
    List<InfoType> getInfoTypeList();
}