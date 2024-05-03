package com.ohgiraffers.section01.exception;

public class Application02 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try { // exception 이 발생할 수 있는 코드 블럭을 여기에 넣는다.


            et.checkEnoughMoney(1000, 100000);
            et.checkEnoughMoney(1000, 10);

            System.out.println("이거는 실행이 안된당~");


        } catch (Exception e) {
            System.out.println("상품 구입이 불가능합니다");
        }
        System.out.print("프로그램 종료");

    }

}
