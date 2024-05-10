package com.ohgiraffers.employee.dao;

import com.ohgiraffers.common.JDBCTemplate;
import com.ohgiraffers.employee.Service.EmployeeService;
import com.ohgiraffers.employee.dto.EmployeeDTO;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import static com.ohgiraffers.common.JDBCTemplate.*;

/*
 * repository란?
 * 데이터를 등록하고 수정하고 삭제하고 조회하는 동의
 * 데이터베이스와 연결되어 동자가는 로직을 수행하는 계층이다.
 *
 * */
public class EmployeeRepository {

    private Properties pros = new Properties();
    private Connection con =null;
    private PreparedStatement pstmt = null;
    private ResultSet rset = null;


    public EmployeeRepository() {
        try {
            this.pros.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/employee-query.xml"));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    public ArrayList employeeViewAll(){

        ArrayList arrayList = new ArrayList();
        String query = pros.getProperty("employeeAll");
        con = getConnection();

        try {
            pstmt = con.prepareStatement(query);
            rset = pstmt.executeQuery();
            while(rset.next()){
                EmployeeDTO emp = new EmployeeDTO();
                emp.setEmpId(rset.getString("EMP_ID"));
                emp.setEmpName(rset.getString("EMP_NAME"));
                emp.setPhone(rset.getString("PHONE"));
                emp.setDeptCode(rset.getString("DEPT_CODE"));
                emp.setJobCode(rset.getString("JOB_CODE"));
                emp.setSalary(rset.getInt("SALARY"));
                emp.setEntYn(rset.getString("ENT_YN"));
                arrayList.add(emp);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(pstmt);
            close(con);

        }
        return arrayList;

    }


    public EmployeeDTO employeeFindName(String name) {
        String query = pros.getProperty("employeeFindName");
        con = getConnection();
        EmployeeDTO emp = new EmployeeDTO();

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, name);
            rset = pstmt.executeQuery();

            if(rset.next()){
                emp.setEmpId(rset.getString("EMP_ID"));
                emp.setEmpName(rset.getString("EMP_NAME"));
                emp.setPhone(rset.getString("PHONE"));
                emp.setDeptCode(rset.getString("DEPT_CODE"));
                emp.setJobCode(rset.getString("JOB_CODE"));
                emp.setSalary(rset.getInt("SALARY"));
                emp.setEntYn(rset.getString("ENT_YN"));

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(rset);
            close(pstmt);
            close(con);
        }
        return emp;
    }

    public EmployeeDTO empFindById(String index) {
        String query = pros.getProperty("employeeFindById");
        con = getConnection();
        EmployeeDTO emp = null;

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, index);
            rset = pstmt.executeQuery();
            if(rset.next()){
                emp = new EmployeeDTO();
                emp.setEmpId(rset.getString("EMP_ID"));
                emp.setEmpName(rset.getString("EMP_NAME"));
                emp.setPhone(rset.getString("PHONE"));
                emp.setDeptCode(rset.getString("DEPT_CODE"));
                emp.setJobCode(rset.getString("JOB_CODE"));
                emp.setSalary(rset.getInt("SALARY"));
                emp.setEntYn(rset.getString("ENT_YN"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(con);
            close(pstmt);
            close(rset);
        }

        return emp;
    }

    public String empInsert(EmpInsertDTO emp) {

    }



}
