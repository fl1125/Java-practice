package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.jbdcUtils.JDBCUtils;


public class jdbcDemo7 {
      
	 public static void main(String[] args) throws ClassNotFoundException {
	        //1.����¼�룬�����û���������
	        Scanner sc = new Scanner(System.in);
	        System.out.println("�������û�����");
	        String username = sc.nextLine();
	        System.out.println("���������룺");
	        String password = sc.nextLine();
	        //2.���÷���
	        boolean flag = new jdbcDemo7().login(username, password);
	        //3.�жϽ���������ͬ���
	        if(flag){
	            //��¼�ɹ�
	            System.out.println("��¼�ɹ���");
	        }else{
	            System.out.println("�û������������");
	        }
	
	        
	    }
	
	
	
	    /**
	     * ��¼����
	     * ʹ��PreparedStatementʵ��
	     * @throws ClassNotFoundException 
	     */
	    public boolean login(String username ,String password) throws ClassNotFoundException{
	        if(username == null || password == null){
	            return false;
	        }
	        //�������ݿ��ж��Ƿ��¼�ɹ�
	        Connection conn = null;
	        PreparedStatement pstmt =  null;
	        ResultSet rs = null;
	        
	        //1.��ȡ����
	        try {
	        	
	            conn = JDBCUtils.getConnection();
	            //2.����sql
	            String sql = "select * from user where username = ?and password =?";
	            //3.��ȡִ��sql�Ķ���
	            pstmt = conn.prepareStatement(sql);
	            //4.ִ�в�ѯ
	            // ������ֵ
	            pstmt.setString(1, username);
	            pstmt.setString(2, password);
	            rs = pstmt.executeQuery();
	            //5.�ж�
	           /* if(rs.next()){//�������һ�У��򷵻�true
	                return true;
	            }else{
	                return false;
	            }*/
	           return rs.next();//�������һ�У��򷵻�true
	
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }finally {
                JDBCUtils.close(rs,pstmt,conn);
	        }
	
	
	        return false;
	    }
	}