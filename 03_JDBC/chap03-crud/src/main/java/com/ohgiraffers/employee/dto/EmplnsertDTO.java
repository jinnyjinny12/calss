package com.ohgiraffers.employee.dto;

public class EmplnsertDTO {

    private String empID;
    private String empName;
    private String empNo;
    private String jobCode;
    private String salLevel;

    public EmplnsertDTO() {
    }


    public EmplnsertDTO(String empID, String empName, String empNo, String jobCode, String salLevel) {
        this.empID = empID;
        this.empName = empName;
        this.empNo = empNo;
        this.jobCode = jobCode;
        this.salLevel = salLevel;
    }


    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public String getSalLevel() {
        return salLevel;
    }

    public void setSalLevel(String salLevel) {
        this.salLevel = salLevel;
    }

    @Override
    public String toString() {
        return "EmplnsertDTO{" +
                "empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salLevel='" + salLevel + '\'' +
                '}';
    }
}
