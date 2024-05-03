package com.ohgiraffers.section03.abstraction.problem2;

public class CarRacer {
     // carRacer 는 자동차를 동작하는 거를 둔다.
    //사람이 자동차에다가 시동을 건다.
    //나른 객체가 차랑 상호작용한다. 그래서 car 라는 객체를 매개변수로 건다.
    public void startUp(Car car){ // 시동걸려고 하면car 클래스가 들어가고
        car.startUp(); //실행시키려면 startUp 을 실행해저야 함.

    }

    public void trunOff(Car car){
    car.turnOff(); //자동차가 시동이 꺼진다.
    }


    public void go(Car car){
        car.go();
    }

    public void stop(Car car){
        car.stop();
    }

}
