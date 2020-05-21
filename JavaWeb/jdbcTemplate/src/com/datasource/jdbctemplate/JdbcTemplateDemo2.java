 package com.datasource.jdbctemplate;



import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import utils.JdbcUtils;

public class JdbcTemplateDemo2 {
    
    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
     
         @Test
     public void test1() {
         
         String sql = "update emp set salary = 2030 where id = ?";
         int count = template.update(sql,1);
         System.out.println(count);
     }

  
     @Test
     public void test2() {
         
      String sql = "insert into emp(id,NAME,gender,salary,join_date,dept_id) values(?,?,?,?,?,?)";
      int count = template.update(sql,6,"ÁùÁùÁù","ÄÐ",5000,null,1);
      System.out.println(count);
     }
     
}
