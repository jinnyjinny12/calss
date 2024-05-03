package com.ohgiraffers.section01.user_type;

import java.util.Arrays;

public class Member {

    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String [] hobby;

    @Override // override 는 재정의하다 라고 한다. 오브젝트를 상속받아서 만들었다.
    public String toString() {
        return "Member {" +
                "id=" + id + '\'' +
                ", pwd=" + pwd + '\''+
                ", name=" + name + '\''+
                ", age=" + age +
                ", gender =" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';

    }

}
