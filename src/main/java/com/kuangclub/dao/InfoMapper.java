package com.kuangclub.dao;

import com.kuangclub.domain.Info;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoMapper {
    @Insert({
        "insert into info (code, type, ",
        "name)",
        "values (#{code,jdbcType=TINYINT}, #{type,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR})"
    })
    int insert(Info record);

    @InsertProvider(type=InfoSqlProvider.class, method="insertSelective")
    int insertSelective(Info record);


    @Select("SELECT * FROM info")
    @Results({
            @Result(property = "code",  column = "code"),
            @Result(property = "type", column = "type"),
            @Result(property = "name", column = "name"),
    })
    List<Info> getInfoList();
}