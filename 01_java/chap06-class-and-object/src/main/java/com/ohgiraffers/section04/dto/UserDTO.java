package com.ohgiraffers.section04.dto;

import java.util.Date;

public class UserDTO {

    private String id;
    private String name;
    private String pwd;
    private java.util.Date enrollDate; // 날짜를 의미하는 자바클래스, 날짜 자료형
    //날짜를 관리하기 위한 데이터 타입

    // 클래스 생성자 구조: 접근제어자 + 클래스명 +(){}
    // 기본 생성자
    public UserDTO() {}

    public UserDTO(String id, String name, String pwd, java.util.Date enrollDate) {
    //매개변수를 전달받는다.
    this.id = id; // 필드에 넣어준다.
    this.name = name;
    this.pwd = pwd;
    this.enrollDate = enrollDate;

    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Date getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(Date enrollDate) {
        this.enrollDate = enrollDate;
    }

//    @Override // 어노테이션 특별한 기능을 가진 것들
//    public String toString(){ //주소값을 출력하고 싶은 게 아니라 내가받은 정보를 출력하고 싶다.
//        return "안녕";
 //   }


    @Override
    public String toString() {
        return "UserDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", enrollDate=" + enrollDate +
                '}';
    }
}
