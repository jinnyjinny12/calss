package com.ohgiraffers.section01.exception;

public class ExceptionTest {
                                                        // 에러가 발생될 수 있음을 미리 알고 어떻게 처리할지 알려줌.
    public void checkEnoughMoney(int price, int money)throws Exception{

        System.out.println("가지고 계신 돈은"+ money + "입니다");

        if (money >=price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");

        }else{

            // 예외를 강제로 발생
            throw new RuntimeException();

        }
            System.out.println("즐 쇼~~~~~~~~~");
    }

}
