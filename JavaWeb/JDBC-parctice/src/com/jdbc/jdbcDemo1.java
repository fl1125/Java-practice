package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/*
 * jdbc��������
 * 
 */
public class jdbcDemo1 {

	public static void main(String[] args)throws Exception {
//      ��������jar��
//		ע������
		Class.forName("com.mysql.jdbc.Driver");
//		��ȡ���ݿ����Ӷ���
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root", "root");
//		����SQL���
		String sql= "update account set balance =500 where id = 1";
      
		
//		��ȡִ��SQL�Ķ���Statement
		Statement stmt = conn.createStatement();
		
//		ִ��SQL
		int count = stmt.executeUpdate(sql);
//		������
		System.out.println(count);
		
//		�ͷ���Դ
		stmt.close();
		conn.close();
	}

}
