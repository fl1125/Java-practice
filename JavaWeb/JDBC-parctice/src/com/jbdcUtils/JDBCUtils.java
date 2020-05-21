package com.jbdcUtils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	    private static String url;
	    private static String username; 
//    定义为user时可能出现错误！！！！
//	     在系统中也有个username属性，这时系统变量覆盖了Properties中的值，这时取得username的值为系统的用户名Administrator，密码为properties中的password去查询数据库，此时用户名名和密码并不匹配就会报错。在Spring完成注入时是用 "${..}"  方式获取值完成注入的。而通过这种表达式也能直接获取到JVM系统属性..........
	    private static String password;
	    private static String driver;
	    /**
	     * 文件的读取，只需要读取一次即可拿到这些值。使用静态代码块
	     */
	    static{
	        //读取资源文件，获取值。
	
	        try {
	            //1. 创建Properties集合类。
	            Properties pro = new Properties();
	
	            //获取src路径下的文件的方式--->ClassLoader 类加载器
//	            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
//	            URL res  = classLoader.getResource("jdbc.properties");
//	            String path = res.getPath();
//	            System.out.println(path);///D:/IdeaProjects/itcast/out/production/day04_jdbc/jdbc.properties
	            //2. 加载文件
	            pro.load(new FileReader("C:\\Java-practice\\JavaWeb\\JDBC-parctice\\jdbc.properties"));
//	            pro.load(new FileReader(path));
//	
	            //3. 获取数据，赋值
	            url = pro.getProperty("url");
	            username = pro.getProperty("username");
	            password = pro.getProperty("password");
	            driver = pro.getProperty("driver");
	            //4. 注册驱动
	            Class.forName(driver);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	    /**
	     * 获取连接
	     * @return 连接对象
	     */
	    public static Connection getConnection() throws SQLException {
	
	        return DriverManager.getConnection(url, username, password);
	    }
	
	    /**
	     * 释放资源
	     * @param stmt
	     * @param conn
	     */
	    public static void close(Statement stmt,Connection conn){
	        if( stmt != null){
	            try {
	                stmt.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        if( conn != null){
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	
	
	    /**
	     * 释放资源
	     * @param stmt
	     * @param conn
	     */
	    public static void close(ResultSet rs,Statement stmt, Connection conn){
	        if( rs != null){
	            try {
	                rs.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        if( stmt != null){
	            try {
	                stmt.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	
	        if( conn != null){
	            try {
	                conn.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	
	}
