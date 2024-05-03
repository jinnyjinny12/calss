package com.ohgiraffers.section03.abstraction.problem3;

public class Car {

    // 상수는 한 번 선언하면 바뀌는게 불가능
    // 퍼블릭으로 둔다음에 파이널 키워드로 만들어서 상수필드?

    //어짜피 자동차가 걸려잇음 -출발 or not?
    //자동차의 기능은 자동차에 기능을 만들어 놓자!
    //

    private boolean isOn;
    private int speed;
    private String name;

    public String carName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }



    public void startUp() { //startUp: 시동을 걸다. // 자동차가 어떤 상태를 가지고 있어?
        if (isOn) { // 자동차의 시동여부를 확인한다
            System.out.println("이미 시동이 걸려있습니다.");

        } else {
            this.isOn = true; // 내꺼라는 isOn 에 접촉한다.
            System.out.println("시동이 걸렸습니다. 이제 출발할 준비가 되었습니다.");

        }

    }

    public void turnOff() { // 시동을 끈다
        if (this.isOn) {

            if (this.speed > 0) {
                System.out.println("자동차를 멈추고 다시 종료해주세요.");

            } else {
                this.isOn = false;
                System.out.println("시동을 끕니다");
            }

        } else {
            System.out.println("이미 시동이 꺼져있습니다");
        }

    }


    public void go() {
        if (this.isOn) {
            this.speed += 10;
            System.out.println("현재 차의 시속은" + this.speed + "km/h 입니다.");
        } else {
            System.out.println("차의 시동을 걸어주세요.");
        }

    }

    public void stop() {
        if (this.isOn) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다.");
            } else {
                System.out.println("차가 멈춰있는 상태입니다.");
            }
        } else {
            System.out.println("시동이 걸려있지 않습니다");

        }


    }


}
