package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMeonyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.MissingResourceException;

public class ExceptionTest {
                                                        // 에러가 발생될 수 있음을 미리 알고 어떻게 처리할지 알려줌.
    public void checkEnoughMoney(int price, int money)throws PriceNegativeException,MoneyNegativeException,NotEnoughMeonyException  {

       if (price < 0){
           throw new PriceNegativeException("상품을 가져올 수 없습니다");
       }

       if(money < 0){
           throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다");

       }
       if(money < price){
           throw new NotEnoughMeonyException("가진 돈보다 상품의 가격이 더 비쌉니다");
       }

       System.out.println("즐쇼~~~~~~~~~~~~~~~~~~~");


    }
    //모든 예외들을 익셉션 하나로 퉁치면 안됨.



}
