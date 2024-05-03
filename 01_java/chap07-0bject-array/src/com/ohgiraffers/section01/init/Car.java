package com.ohgiraffers.section01.init;

public class Car {

    private String modelNames;
    private int maxSpeed;

    public Car(String modelNames, int maxSpeed){
        this.modelNames = modelNames;
        this.maxSpeed = maxSpeed;
    }


    public void driveMaxSpeed() {
        System.out.println(modelNames +"최고 시속 " + maxSpeed+ "km/h 입니다");

    }


}
