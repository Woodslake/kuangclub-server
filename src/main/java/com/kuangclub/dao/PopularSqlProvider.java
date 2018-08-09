package com.kuangclub.dao;

import com.kuangclub.domain.Popular;
import org.apache.ibatis.jdbc.SQL;

public class PopularSqlProvider {

    public String insertSelective(Popular record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("popular");
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getContent() != null) {
            sql.VALUES("content", "#{content,jdbcType=VARCHAR}");
        }
        
        if (record.getImg() != null) {
            sql.VALUES("img", "#{img,jdbcType=VARCHAR}");
        }
        
        if (record.getUrl() != null) {
            sql.VALUES("url", "#{url,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }
}