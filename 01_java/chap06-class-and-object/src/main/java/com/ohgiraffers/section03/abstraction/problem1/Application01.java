package com.ohgiraffers.section03.abstraction.problem1;


public class Application01 {

    public static void main(String[] args) {

        Car car = new Car();
        CarRacer carRacer = new CarRacer();
        carRacer.setName ("이상우");

        // 자동차에 시동을 건다.
        // scanner + while 해서 입력에 따라 어떻게 되야 할지 함수를 만들 수 있다.
        car.setOn(true); // 자동차가 시장이 걸려있다
        if(car.isOn()){ /// 자동차는 출발할 수 있다.
            System.out.println("시동이 걸렸습니다");
            System.out.println("자동차를 출발합니다");

            // 자동차를 출발한다고 가정함.
            carRacer.setOn(true); // 자동차의 엑셀을 밟고 있다.
            if(carRacer.isOn()){
                car.setSpeed(10); // 차는 10식 증가가 된다.
            }
            System.out.println("자동차의 현재속도" + car.getSpeed() + "km/h");

            if(car.getSpeed() == 0){ //자동차의 스피드가 0이 아니면 시동을 끄지 못하는 상태다.
                //속도가 10인 상태에서는 시동을 끌 수 없다.
              System.out.println("자동차의 시동을 끕니다");
              car.setOn(false);
            }else{
                System.out.println("자동차를 정지하지 않은 상태에서 자동차를 멈출 수 없습니다");
            }

            System.out.println("자동차를 멈추겠습니다.");
            car.setSpeed(0); // 자동차의 스피드가 0이 되면 멈출 수 잇는 상태가 됨.
            //시동을 끌 수 있음.
            System.out.println("이제 자동차를 정지할 수 있습니다. ");
            car.setOn(false);


            // 이걸 어플리케이션 하나에 다 담아두면 힘들다 프라블럼 2번으로 가자


        }

    }
}
