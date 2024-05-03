package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMeonyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

import java.util.Scanner;

public class Application02 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        /*
        *
        * scanner 는 시스템에서 입력 받을 수 있는 기능을 수행한다.
        * 그러나 이러한 기능은 어플리케이션이 실행하는 과정에서 잘못된 임의의 값 값이 들어갈 수 있다.
        * 그렇기 대문에 항상 Scanner.clos() 를 호출하여 리소스를 제거해주어야 한다.
        *
        * */


        Scanner sc = new Scanner(System.in);


        try {

            System.out.println("제품 가격을 입력해주세요");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("가진돈을 입력해주세요");
            int money = sc.nextInt();
            sc.nextLine();

            et.checkEnoughMoney(20000,300000);
        } catch (PriceNegativeException e) {
            System.out.println("Price Negative Exception가 발생함");

        } catch (MoneyNegativeException e) {
            System.out.println("Money Negative Exception가 발생함");

        } catch (NotEnoughMeonyException e) {
            System.out.println("not enough money Exception가 발생함");
        }finally { //finally 블럭은 오류가 있던 없던 항상 실행하는 블럭이다.

            /*
            * 위에 설명한 내용과 같이 Scanner 는 리소스를 사용하면 닫아주어야 한다.
            * 그렇기 때문에try 블럭에서 닫는 경우 에러가 발생되었을 때 닫히지 않는 경우가 발생할 수 있어
            * finally 블럭에서 scanner에 할당된 리소스를 제거하여 오류가 발생하던 발생하지 않던 리소르르 제거하게 된다.
            *
            * */

            sc.close();
            System.out.println("나의 길을 간다");
        }
        sc.nextLine();


        //확장 문법
        /*
        * 위의 finally 는 주로 리소스를 제거하는 경우 많이 사용하기 때문에 이를 축약한 확장 문법으로 try블럭에()소괄호 부분에
        * 리소스할당이 필요한 인스턴스를 생성하게 된다면
        * try and catch 블럭에 오류가 있던 리소스를 제거하게 된다.
        * 즉, sc.close()를 항상 마지막에 호출한다는 이야기이다.
        *
        *
        * */

        try(Scanner sc2 = new Scanner(System.in)) {
            try {

                System.out.println("제품 가격을 입력해주세요");
                int price = sc2.nextInt();
                sc.nextLine();
                System.out.println("가진돈을 입력해주세요");
                int money = sc2.nextInt();
                sc.nextLine();

                et.checkEnoughMoney(20000,300000);
            } catch (PriceNegativeException e) {
                System.out.println("Price Negative Exception가 발생함");

            } catch (MoneyNegativeException e) {
                System.out.println("Money Negative Exception가 발생함");

            } catch (NotEnoughMeonyException e) {
                System.out.println("not enough money Exception가 발생함");
            }


        }

        System.out.println("즐쇼~~~~~~");

    }
}
