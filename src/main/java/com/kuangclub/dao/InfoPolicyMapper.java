package com.kuangclub.dao;

import com.kuangclub.domain.InfoPolicy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface InfoPolicyMapper {
    @Insert({
        "insert into info_policy (title, content, ",
        "img, url)",
        "values (#{title,jdbcType=VARCHAR}, #{content,jdbcType=VARCHAR}, ",
        "#{img,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR})"
    })
    int insert(InfoPolicy record);

    @InsertProvider(type=InfoPolicySqlProvider.class, method="insertSelective")
    int insertSelective(InfoPolicy record);

    @Select("SELECT * FROM info_policy")
    List<InfoPolicy> getInfoPolicyList();
}