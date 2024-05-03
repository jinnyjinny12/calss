package com.ohgiraffers.section02.variable;

public class Application01{
    /*변수의 사용 목적
 *   1. 값에 의미를 부여하기 위한 목적
 *   2. 한 번 저장해둔 값을 재사용 하기 위한 목적.
 *   3. 시간에 따라 변하는 값을 저장하고 사용할 수 있다.
 * */

    public static void main(String[] args){
        System.out.println("===== 값에 의미 부여 테스트======");
        System.out.println("보너스를 포함한 급여 : " + (10000000 + + 20000000) + "원");
        int variable; // 변수 선언문
        //variable = 10; // 변수 초기화까지해야 변수 사용 가능, 동시에 가능.

        int salary = 10;
        int bonus =2;
        System.out.println("보너스를 포함한 급여 : " +(salary + bonus) + "원");


    // 한 번 저장해둔 값을 재사용하기 위한 목적
        System.out.println("======== 변수에 저장한 값 재사용 텍스트 =========");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");
        System.out.println("1번 고객에게 포인트 100포인트 지급하였습니다");

        System.out.println("변수를 사용하는 경우 ");
        int point = 100;
        System.out.println("1번 고객에게 포인트 "+(point)+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");
        System.out.println("1번 고객에게 포인트 "+(point+=10)+"포인트 지급하였습니다.");

        double sivler = 0.3;
        double vip = 0.5;
        //백만원 이하는 절삭


    }

}




