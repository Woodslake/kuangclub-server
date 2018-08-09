package com.kuangclub.dao;

import com.kuangclub.domain.InfoHeadline;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoHeadlineMapper {
    @Insert({
        "insert into info_headline (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(InfoHeadline record);

    @InsertProvider(type=InfoHeadlineSqlProvider.class, method="insertSelective")
    int insertSelective(InfoHeadline record);

    @Select("SELECT * FROM info_headline")
    List<InfoHeadline> getInfoHeadlineList();
}