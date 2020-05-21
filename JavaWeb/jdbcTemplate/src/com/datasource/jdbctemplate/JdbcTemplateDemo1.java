 package com.datasource.jdbctemplate;

import org.springframework.jdbc.core.JdbcTemplate;

import utils.JdbcUtils;

/**
 * @author dell
 * @date 2020/05/18
 */
/**
 * JdbcTemplate����
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        //1.����jar��
        //2.����JDBCTemplate����
        JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        //3.���÷���
        String sql = "update account set balance = 5000 where id = ?";
        int count = template.update(sql, 3);
        System.out.println(count);
    }
}
