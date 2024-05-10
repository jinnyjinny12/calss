package com.ohgiraffers.common;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {

    public static Connection getConnection() {

        Connection con = null;
        Properties prop = new Properties();


        try {
            prop.load(new FileReader("src/main/java/com/ohgiraffers/config/connection-info.properties"));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");

            // 클래스가 존재하는지 확인하기 위함
            Class.forName(driver);
            con = DriverManager.getConnection(url, prop);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) { // exception 순서 중요함! 가장 큰 범위의 exception 을 나중에 써줘야 함.
            throw new RuntimeException(e);
        }
        return con;

    }

    public static void close(Connection con){
        try {
            if(con != null && !con.isClosed()){
                con.close();
            }

            con.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void close(PreparedStatement pstmt){

        try {
            if(pstmt != null && pstmt.isClosed()) {
                pstmt.close();
            }
            pstmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static void close(ResultSet rset) { // 결과를 받는 것 : 그 전에 statement 가 필요하다.

        try {
            if(rset !=null && !rset.isClosed()) { // rset 이 이미 닫혀있음 우리가 또 닫을 필요가 없음!
                rset.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
