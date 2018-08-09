package com.kuangclub.dao;

import com.kuangclub.domain.InfoType;
import org.apache.ibatis.jdbc.SQL;

public class InfoTypeSqlProvider {

    public String insertSelective(InfoType record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("info_type");
        
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