package com.ohgiraffers.section03.abstraction.problem1;

public class Car {

    private boolean isOn;
    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
