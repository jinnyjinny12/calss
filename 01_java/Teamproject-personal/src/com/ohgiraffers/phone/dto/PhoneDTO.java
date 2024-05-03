package com.ohgiraffers.phone.dto;

//DTO 클래스는 Data Transfer Object 의 약자고 시스템에서 데이터를 전송하는 데 사용됨.
// 캡슐화, 전송 등을 지원한다.
// 필드를 private 를 통해 지정하고 이 필드에 접근하기 위해 getter setter 메서드를 제공함.
// 그리고 toString 메서드를 통해 객체의 내요을 문자열로 표현
//

public class PhoneDTO {
    private String name;
    private String number;
    private String address;




    public PhoneDTO(String name, String number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PhoneDTO{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
