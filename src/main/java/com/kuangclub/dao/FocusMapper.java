package com.kuangclub.dao;

import com.kuangclub.domain.Focus;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FocusMapper {
    @Insert({
        "insert into focus (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(Focus record);

    @InsertProvider(type=FocusSqlProvider.class, method="insertSelective")
    int insertSelective(Focus record);

    @Select("SELECT * FROM focus")
    List<Focus> getFocusList();
}