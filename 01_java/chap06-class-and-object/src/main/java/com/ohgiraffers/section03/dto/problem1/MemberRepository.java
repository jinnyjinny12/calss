package com.ohgiraffers.section03.dto.problem1;

import java.util.ArrayList;

public class MemberRepository {

    //배열의 길이를 지정해주지 않아도 된다.
    //전 인덱스에서 주소를 가지고 있다.배열의 길이가 연속적이지 않아도 된다.

    ArrayList data = new ArrayList();


    public void addMember(String name, char gender, int age,String address,String phone){
        data.add(name);
        data.add(gender);
        data.add(age);
        data.add(address);
        data.add(phone);

    }

    public void print(){
        System.out.println(this.data);
    }
    }



