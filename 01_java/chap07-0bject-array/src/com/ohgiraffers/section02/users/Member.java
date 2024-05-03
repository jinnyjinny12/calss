package com.ohgiraffers.section02.users;

public class Member {
    private int num;
    private String id;
    private String pwd;
    private String names;
    private int age;
    private char gender;

    public Member(){

    }

    public Member(int num, String id, String pwd, String names, int age, char gender) {
        this.num = num;
        this.id = id;
        this.pwd = pwd;
        this.names = names;
        this.age = age;
        this.gender = gender;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "num=" + num +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", names='" + names + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
