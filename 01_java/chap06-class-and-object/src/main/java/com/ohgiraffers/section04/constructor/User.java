package com.ohgiraffers.section04.constructor;

public class User {

    // private 는 클래스 내부에서만 사용할 수 있다.
    private String name;
    private int age;
    private String phone;

    public User() { // 기본 생성자

       }

    public User(String name, int age) {
        //생성자는 이렇게 많든다. 얘 만들 때 무조건 나이 이름 전달해라
        this.name = name;
        this.age = age;

    }

    public User(String name, int age, String phone) {
        this.phone = phone;
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }
}
