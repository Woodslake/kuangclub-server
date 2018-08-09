package com.kuangclub.dao;

import com.kuangclub.domain.Policy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PolicyMapper {
    @Insert({
        "insert into policy (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(Policy record);

    @InsertProvider(type=PolicySqlProvider.class, method="insertSelective")
    int insertSelective(Policy record);

    @Select("SELECT * FROM policy")
    List<Policy> getPolicyList();
}