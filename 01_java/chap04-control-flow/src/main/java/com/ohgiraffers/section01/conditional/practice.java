package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요");
        double num1 = scanner.nextDouble();

        System.out.println("두 번째 수를 입력하세요");
        double num2 = scanner.nextDouble();

        System.out.println("연산자를 입력하세요. (+,-,*,/)");
        char operator = scanner.next().charAt(0);

        double result = 0; // result 를 선언하고 초기값을 0으로 설정하는 역할.
        // 사용자가 연산 기호를 입력한 후에야 실제 계산을 수행함으로 초기값을 가진 변수가 필요

        if (operator == '+') {
            result = num1 + num2;
        }else if (operator == '-') {
            result = num1 - num2;
        }else if (operator == '*') {
            result = num1 * num2;
        }else if (operator == '/') {
            if(num2 == 0){
                System.out.println("0으로는 나눌 수 없습니다");
                return;
            }
            result = num1 / num2;
        }else{
            System.out.println("잘못된 연산 기호입니다");
        }
        System.out.println("결과 :" + result);









    }
}


/*계산기 만들기
    * 두 수와 연산기호를 입력받아
    * 수식에 맞는 연산을 수해하는 프로그램을 만들어주세요.
        * 1) 내가 어떻게 입력할 건지에 대해 System.out.println(); 으로 로직을 짠다.
        * 2) 연산기호가 계산되는 함수를 만든다.
        *   2-1) 연산자를 기준으로 if else 함수를 만든다.
        *   2-2) **나누기
        *   2-3) **곱하기 0일때
        *
        * 2) 숫자와 연산기호를 입력하는 걸 만든다.
    * 3) 출력한다.

 */