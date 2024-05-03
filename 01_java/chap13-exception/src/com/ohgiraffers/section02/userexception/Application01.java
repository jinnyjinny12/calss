package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMeonyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {

        public static void main(String[] args) {


//            try {
//                et.checkEnoughMoney(100,200);
//
//             try {
//                     et.checkEnoughMoney(100, -200);
//             }catch (Exception e) {
//                     System.out.println("정신체리");
//
//             }
//
//            } catch (Exception e) {
//                System.out.println("상품 가격을 정수로 다시 입력해주세요");
//
//            }
            ExceptionTest et = new ExceptionTest();
//             try{
//                     et.checkEnoughMoney(100,200);
//             }catch(PriceNegativeException e){
//                     System.out.println("제품 가격이 음수야");
//
//             }catch(MoneyNegativeException e){
//                     System.out.println("가진돈이 음수야");
//
//             }catch (NotEnoughMeonyException e){
//                     System.out.println("제품이 가진돈 보다 더 비싸");
//             }catch(Exception e){
//                     System.out.println("뭐든 에러");
//             }


//                try {
//                        et.checkEnoughMoney(-100,200);
//                        et.checkEnoughMoney(200,-200);
//                        et.checkEnoughMoney(10,200);
//
//                } catch (PriceNegativeException e) { // 필기 다시하기
//                        System.out.println("제품의 가격이 음수일 수 없습니다");
//
//                } catch (MoneyNegativeException e) {
//                        System.out.println("가진돈이 음수일 수 없습니다");
//
//                } catch (NotEnoughMeonyException e) {
//                        System.out.println("제품의 가격이 비싸요");
//                }



                try {
                    et.checkEnoughMoney(-100,200);
                    et.checkEnoughMoney(200,-200);
                    et.checkEnoughMoney(10,200);

            } catch (PriceNegativeException e) {
                    System.out.println("제품의 가격이 음수일 수 없습니다");

            } catch (MoneyNegativeException e) {
                    System.out.println("가진돈이 음수일 수 없습니다");

            } catch (NotEnoughMeonyException e) {
                    System.out.println("제품의 가격이 비싸요");
            }

            System.out.println("쇼핑종료");

        }

}
