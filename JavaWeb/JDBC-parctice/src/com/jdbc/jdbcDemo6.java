package com.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.domain.Emp;
import com.jbdcUtils.JDBCUtils;


public class jdbcDemo6 {
	public static void main(String[] args) {
	     List<Emp> list = new jdbcDemo5().findAll(); 
	     System.out.println(list);
	}
	
	/*
	 * 演示jdbc工具类
	 */
	
	public List<Emp>  findAll() throws ClassNotFoundException{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<Emp> list = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		    conn = JDBCUtils.getConnection();
		    
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
	
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			JDBCUtils.close(rs, stmt, conn);
	
		}
		
		return list;
	}
}
