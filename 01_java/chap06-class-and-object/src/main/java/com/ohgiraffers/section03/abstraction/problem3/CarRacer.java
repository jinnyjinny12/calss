package com.ohgiraffers.section03.abstraction.problem3;

public class CarRacer {
     // carRacer 는 자동차를 동작하는 거를 둔다.
    //사람이 자동차에다가 시동을 건다.
    //나른 객체가 차랑 상호작용한다. 그래서 car 라는 객체를 매개변수로 건다.




    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) { // 카 레이서한테 카를 준다.
        this.car = car;
    }

    public void startUp(){ // 시동걸려고 하면car 클래스가 들어가고
        this.car.startUp(); //실행시키려면 startUp 을 실행해저야 함.

    }

    public void trunOff(){

        this.car.turnOff(); //자동차가 시동이 꺼진다.
    }
    //this 내 자동차를 끈다.내 자동차를 켠다. '내' = this

    public void go(){

        this.car.go();
    }

    public void stop(){

        this.car.stop();
    }

    public void myCarInfo(){
        System.out.println(this.car.carName());

    }

}
