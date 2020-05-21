package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcDemo4 {

	public static void main(String[] args) {
		
		  Connection conn = null;
		  Statement stmt = null;
           ResultSet rs = null;
	
		try {
		
			Class.forName("com.mysql.jdbc.Driver");
	           
			String sql = "select * from account";
			conn = DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
			
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery(sql);
        
		    while(rs.next()){
		    
		    	int id = rs.getInt(1);
		        String name = rs.getNString("name");
		        double blance = rs.getDouble(3);
		     
		        System.out.println(id +"  "+ name +"  "+ blance);
		    }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		}finally {
			if(rs != null){
		}
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} 
			if(conn != null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} 
	
		}

		
		
	}	

}
