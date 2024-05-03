package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement(){
        /*
        * [for문 표현식]
        * for(조건식; 조건식; 증감식){
        *  // 조건식이 참인 경우 실행할 구문 == 반복할 구문
        * }
        * */
        for (int i = 0; i <=10; i++) {
            for (int x = 0; x <= 10; x++) {
                System.out.println(" 천 원 단위 " + x);}
            System.out.println("만 원 단위 : " + i);

        }

    }
    //구구단 만들어주세요!
    //1~9까지 출력한다
    //그 두개를 곱한다
    //9까지 반복한다.


    public void gugudan(){
       for (int i = 1; i <= 9; i++ ) {
           for (int j = 1; j <= 9; j++ ) {
               System.out.println(i*j);
           }

        }
    }

//10명의 이름과 나이를 입력받아 화면에 출력하기
    /*
    * 1) 입력받는다 : Scanner sc = new scanner (system.in)
    * 2) 출력한다 : 메인 메서드 -> A_for(class 명 ) = new A_for ;
    * 3)
    *
    *
    *
    * */
//예: 이름 000 나이 00

    public void assignment(){
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++ ) {
            System.out.println("이름" + i + " : ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("나이" + i + " : ");
            int age = sc.nextInt();
            System.out.println( "이름 " + name + " 나이 " + age );

        }

    }


    //2의 배수의 값만 출력한다.
    // for (
    public void gugudanTwo()
    {   int i = 2;
        for (int j = i; j <= 9; j++)
        {    // 7 % 2 == 0
            if(j % i == 0 ) //
                for (int y = 2; y <= 9; y++)
                {
                    System.out.println(j + "*" + y + "=" + j * y); // 2 * 3 = 6
                }
        }
    }

}
