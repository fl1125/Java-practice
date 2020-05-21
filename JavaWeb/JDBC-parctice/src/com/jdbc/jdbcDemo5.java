package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.domain.Emp;


public class jdbcDemo5 {
	
	public static void main(String[] args) {
	     List<Emp> list = new jdbcDemo5().findAll(); 
	     System.out.println(list);
	}
	
	public List<Emp>  findAll(){
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> list = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		    conn =DriverManager.getConnection("jdbc:mysql:///db2", "root", "root");
		
		    String sql = "select * from emp";
		    
		    stmt = conn.createStatement();
		    
		    rs =  stmt.executeQuery(sql);
		    
		    
		    Emp emp = null;
		    list = new ArrayList<Emp>();
		    while(rs.next()){
		    	int id = rs.getInt("id");
		    	String name  = rs.getNString("NAME");
		    	String gender = rs.getNString("gender");
		    	double salary = rs.getDouble("salary");
		    	Date join_date = rs.getDate("join_date");
		    	int dept_id = rs.getInt("dept_id");
		    	
		    	emp = new Emp();
		    	
		    	emp.setId(id);
		     	emp.setNAME(name);
		    	emp.setGender(gender);
		    	emp.setSalary(salary);
		    	emp.setJoin_date(join_date);
		    	emp.setDept_id(dept_id);
		   
		        list.add(emp);
		    }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs != null){
			try {
				rs.close();
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
			
			if(stmt != null){
				try {
					stmt.close();
				} catch (SQLException e) {
				
					e.printStackTrace();
				   }
				}
				
	
		}
		
		return list;
	}
}	

