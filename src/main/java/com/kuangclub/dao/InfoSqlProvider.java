package com.kuangclub.dao;

import com.kuangclub.domain.Info;
import org.apache.ibatis.jdbc.SQL;

public class InfoSqlProvider {

    public String insertSelective(Info record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("info");
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}