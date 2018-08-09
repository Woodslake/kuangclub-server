package com.kuangclub.dao;

import com.kuangclub.domain.InfoPopular;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoPopularMapper {
    @Insert({
        "insert into info_popular (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(InfoPopular record);

    @InsertProvider(type=InfoPopularSqlProvider.class, method="insertSelective")
    int insertSelective(InfoPopular record);

    @Select("SELECT * FROM info_popular")
    List<InfoPopular> getInfoPopularList();
}