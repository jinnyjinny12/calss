package com.ohgiraffers.section01.statement;

import com.ohgiraffers.common.JDBCTemplate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;

public class Application03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Connection con = JDBCTemplate.getConnection();
        // 쿼리문을 저장하고 실행하는 기능을 하는 용도의 인터페이스
        Statement stmt = null;
        // select 결과집합을 받아올 용도의 인터페이스
        ResultSet rset = null;

        String name = "선동일";

        System.out.println("조회할 사원번호 입력 : ");
        int empid =sc.nextInt();
        sc.nextLine();

        try {
            //sql에 말하는 방식을 만들어줌.
            //sql은 sql 문법을 이용해 말함.
            stmt = con.createStatement();
            rset = stmt.executeQuery("SELECT EMP_ID, EMP_NAME FROM EMPLOYEE WHERE EMP_ID =" + empid);



            while (rset.next()) {
                System.out.println(rset.getString("EMP_ID") + " " + rset.getString("EMP_NAME"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
            close(rset);
            close(stmt);

        }
    }
}
