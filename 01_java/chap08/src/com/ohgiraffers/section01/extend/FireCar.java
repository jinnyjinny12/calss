package com.ohgiraffers.section01.extend;

// 상속표현식
// 접근제어자 class 클래스명 extends 부모클래스{멤버}
public class FireCar extends Car {

    //알트 인서트 컨스트럭터 엔터
//    public FireCar() { //FireCar 부모 클래스를 상속하고 있다.
//        super(true); // 부모 클래스의 생성자를 호출한다. // 기본생성자 없이 오류가없게 하려면 매개변수에 맞는 값을 가져오면 된다.
//    }

    public FireCar() {
        /*
         * 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
         *  부모의 기본 생성자를 호출하는 구문이다.
         *  해당 생성자가 호출 될 시 가장 먼저 Car 클래스 호출 내용이 출력될 것이다.
         *  명시적, 묵시적 전부 사용 가능하다.
         * */

        super();
        System.out.println("Fire Car 클래스의 기본생성자 호출됨..");
    }

    /*
     * @Override 어노테이션
     *  JDK 1.5부터 추가된 문법으로 오버라이딩 성립 요건을 체크하여 성립되지 않는 경우 컴파일 에러를 발생시킨다.
     *  (오버라이딩이 정상적으로 작성된 것인지를 체크해주는 기능)
     *  오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
     * */

    @Override //대상이 없으면 에러. //지우고 프린트"test"하면 그냥 나옴
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빠아아아아ㅏㅇ아ㅏㅇ아앙빠아빵빠아앙아빠아아앙");
        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다~~~~비키세요~~~~");
        }
    }

    public void sprayWarter(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다!!!!!!!!!!~~~~~~~~~~");
    }


}
