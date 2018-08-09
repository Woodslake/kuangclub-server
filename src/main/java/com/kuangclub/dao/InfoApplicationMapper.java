package com.kuangclub.dao;

import com.kuangclub.domain.InfoApplication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoApplicationMapper {
    @Insert({
        "insert into info_application (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(InfoApplication record);

    @InsertProvider(type=InfoApplicationSqlProvider.class, method="insertSelective")
    int insertSelective(InfoApplication record);

    @Select("SELECT * FROM info_application")
    List<InfoApplication> getInfoApplicationList();
}