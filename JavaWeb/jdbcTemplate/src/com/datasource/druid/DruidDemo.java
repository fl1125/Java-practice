package com.datasource.druid;


import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;

/**
 * @author dell
 * @date 2020/05/16
 */
public class DruidDemo {

	public static void main(String[] args) throws Exception {
		
      Properties pro = new Properties();
      
      InputStream is =  DruidDemo.class.getClassLoader().getResourceAsStream("druid.properties");
      pro.load(is);
      
      DataSource ds = DruidDataSourceFactory.createDataSource(pro);
      
      Connection conn = ds.getConnection();
      System.out.println(conn);
	}

}
