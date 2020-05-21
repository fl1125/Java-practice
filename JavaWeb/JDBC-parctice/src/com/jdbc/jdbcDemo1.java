package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*
 * jdbc快速入门
 * 
 */
public class jdbcDemo1 {

	public static void main(String[] args)throws Exception {
//      导入驱动jar包
//		注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		获取数据库连接对象
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", "root");
//		定义SQL语句
		String sql= "update account set balance =500 where id = 1";
      
		
//		获取执行SQL的对象。Statement
		Statement stmt = conn.createStatement();
		
//		执行SQL
		int count = stmt.executeUpdate(sql);
//		处理结果
		System.out.println(count);
		
//		释放资源
		stmt.close();
		conn.close();
	}

}
