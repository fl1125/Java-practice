 package com.datasource.druid;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import utils.JdbcUtils;

/**
 * @author dell
 * @date 2020/05/15
 */

public class DruidDemo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
          conn = JdbcUtils.getConnection();
         
          String sql = "insert into account values(null,?,?)";
         
          pstmt = conn.prepareStatement(sql);
         
         pstmt.setString(1, "wangwu");
         pstmt.setDouble(2, 3000);
         
         int count = pstmt.executeUpdate();
         
         System.out.println(count);
         
         
        } catch (SQLException e) {
             e.printStackTrace();
        }finally {
            JdbcUtils.close(pstmt, conn);
        }

    }

}
