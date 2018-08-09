package com.kuangclub.dao;

import com.kuangclub.domain.Headline;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HeadlineMapper {
    @Insert({
        "insert into headline (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(Headline record);

    @InsertProvider(type=HeadlineSqlProvider.class, method="insertSelective")
    int insertSelective(Headline record);

    @Select("SELECT * FROM headline")
    @Results({
            @Result(property = "title",  column = "title"),
            @Result(property = "content", column = "content"),
            @Result(property = "img", column = "img"),
            @Result(property = "url", column = "url"),
    })
    List<Headline> getHeadlineList();
}