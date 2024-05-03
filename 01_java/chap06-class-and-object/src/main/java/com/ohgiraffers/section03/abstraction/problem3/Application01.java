package com.ohgiraffers.section03.abstraction.problem3;

public class Application01 {


    public static void main(String[] args) {
        Car ram = new Car();
        ram.setName("람보르기니");

        Car po = new Car();
        po.setName("포르쉐");

        CarRacer lee = new CarRacer();
        lee.setCar(ram);
        lee.myCarInfo();


        lee.startUp();
        po.startUp();

        lee.go();

        lee.stop();
        lee.trunOff();



    }
}



