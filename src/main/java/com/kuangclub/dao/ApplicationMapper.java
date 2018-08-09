package com.kuangclub.dao;

import com.kuangclub.domain.Application;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ApplicationMapper {
    @Insert({
        "insert into application (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(Application record);

    @InsertProvider(type=ApplicationSqlProvider.class, method="insertSelective")
    int insertSelective(Application record);

    @Select("SELECT * FROM application")
    List<Application> getApplicationList();
}