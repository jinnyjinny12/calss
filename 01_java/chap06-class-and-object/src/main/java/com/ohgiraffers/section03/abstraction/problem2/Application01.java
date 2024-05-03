package com.ohgiraffers.section03.abstraction.problem2;

public class Application01 {


    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car();

        CarRacer carRacer = new CarRacer();

        carRacer.startUp(car); //carRacer 는 자동차를 가져야 차를 움직일 수 있다. 내가 조작할 자동차는 1대이다.
        carRacer.go(car1);
        carRacer.stop(car1);
        carRacer.trunOff(car1);

    }
}



