package com.kuangclub.dao;

import com.kuangclub.domain.Popular;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PopularMapper {
    @Insert({
        "insert into popular (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(Popular record);

    @InsertProvider(type=PopularSqlProvider.class, method="insertSelective")
    int insertSelective(Popular record);

    @Select("SELECT * FROM popular")
    List<Popular> getPopularList();
}