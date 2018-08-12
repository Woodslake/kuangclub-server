package com.kuangclub.dao;

import com.kuangclub.domain.InfoRecommend;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoRecommendMapper {
    @Insert({
        "insert into info_recommend (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(InfoRecommend record);

    @InsertProvider(type=InfoRecommendSqlProvider.class, method="insertSelective")
    int insertSelective(InfoRecommend record);

    @Select("SELECT * FROM info_recommend")
    List<InfoRecommend> getInfoRecommendList();
}