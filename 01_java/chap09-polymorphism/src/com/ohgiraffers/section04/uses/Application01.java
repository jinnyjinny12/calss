package com.ohgiraffers.section04.uses;

public class Application01 {

    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        //아래의 클래스는 추상메서드로 서 생성이 불가능하다.
       //Car car = new Car();

        FireCar fireCar = new FireCar();
        fireCar.go();
        fireCar.stop();
        fireCar.horn();

        RacingCar racingCar = new RacingCar();
        racingCar.go();
        racingCar.stop();

        Car[] cars = new Car[2];
        cars[0] = fireCar;
        cars[1] = racingCar;

        for (Car car : cars) {
            car.go();
            car.stop();

            //interface 에 구현된 메서드로 자동차는 horn() 을 갖지 않아서 오류가 발생함.
            //car.horn();
        }



    }

}
