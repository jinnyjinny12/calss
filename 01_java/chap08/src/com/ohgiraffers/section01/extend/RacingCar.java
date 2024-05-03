package com.ohgiraffers.section01.extend;


public class RacingCar extends Car {
    public RacingCar() {
        super(); //컴파일러가 자동으로 추가해줌
        System.out.println("RacingCar 클래스 기본 생성자 호출됨");
    }

    @Override
    public void soundHorn() {
        System.out.println("RacingCar는 경적을 울리지 않음");
    }

    @Override
    public void stop() {
        System.out.println("RacingCar 멈춤");
    }

    @Override
    public void run() {
        System.out.println("RacingCar 전속력으로 질주");
    }

}