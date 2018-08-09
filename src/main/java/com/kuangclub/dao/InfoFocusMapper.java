package com.kuangclub.dao;

import com.kuangclub.domain.InfoFocus;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoFocusMapper {
    @Insert({
        "insert into info_focus (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(InfoFocus record);

    @InsertProvider(type=InfoFocusSqlProvider.class, method="insertSelective")
    int insertSelective(InfoFocus record);

    @Select("SELECT * FROM info_focus")
    List<InfoFocus> getInfoFocusList();
}