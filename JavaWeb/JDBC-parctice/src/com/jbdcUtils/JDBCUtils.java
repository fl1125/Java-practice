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
//    ����Ϊuserʱ���ܳ��ִ��󣡣�����
//	     ��ϵͳ��Ҳ�и�username���ԣ���ʱϵͳ����������Properties�е�ֵ����ʱȡ��username��ֵΪϵͳ���û���Administrator������Ϊproperties�е�passwordȥ��ѯ���ݿ⣬��ʱ�û����������벢��ƥ��ͻᱨ����Spring���ע��ʱ���� "${..}"  ��ʽ��ȡֵ���ע��ġ���ͨ�����ֱ��ʽҲ��ֱ�ӻ�ȡ��JVMϵͳ����..........
	    private static String password;
	    private static String driver;
	    /**
	     * �ļ��Ķ�ȡ��ֻ��Ҫ��ȡһ�μ����õ���Щֵ��ʹ�þ�̬�����
	     */
	    static{
	        //��ȡ��Դ�ļ�����ȡֵ��
	
	        try {
	            //1. ����Properties�����ࡣ
	            Properties pro = new Properties();
	
	            //��ȡsrc·���µ��ļ��ķ�ʽ--->ClassLoader �������
//	            ClassLoader classLoader = JDBCUtils.class.getClassLoader();
//	            URL res  = classLoader.getResource("jdbc.properties");
//	            String path = res.getPath();
//	            System.out.println(path);///D:/IdeaProjects/itcast/out/production/day04_jdbc/jdbc.properties
	            //2. �����ļ�
	            pro.load(new FileReader("C:\\Java-practice\\JavaWeb\\JDBC-parctice\\jdbc.properties"));
//	            pro.load(new FileReader(path));
//	
	            //3. ��ȡ���ݣ���ֵ
	            url = pro.getProperty("url");
	            username = pro.getProperty("username");
	            password = pro.getProperty("password");
	            driver = pro.getProperty("driver");
	            //4. ע������
	            Class.forName(driver);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	    /**
	     * ��ȡ����
	     * @return ���Ӷ���
	     */
	    public static Connection getConnection() throws SQLException {
	
	        return DriverManager.getConnection(url, username, password);
	    }
	
	    /**
	     * �ͷ���Դ
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
	     * �ͷ���Դ
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
