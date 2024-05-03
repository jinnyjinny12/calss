package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

//<접근방법>
//1. 자바 프로그램 안에 'main'메서드를 포함하는 'practice2' 클래스를 정의한다.
//2.클래스(practice2) 내 pt2 라는 함수를 만든다.
//3.pt2.calculator 라는 함수를



public class practice2 {
    public static void main(String[] args) {
        practice2 pt2 = new practice2();
        String st = pt2.calculator();
        //
        System.out.printf(st);
    }

    // <접근방법>
    // 1.calculator 매서드를 만든다. 실수로 만드는 거 추천 double
    //public double? calculator(){
    public String calculator() {

        Scanner sc = new Scanner(System.in);
        //입력받을 수 잇는 기능을 추가한다
        //Scanner sc = new Scanner(System.in);
        //2.첫번째 수를 입력받는다.
        int first = sc.nextInt();
        //2-1. 두번째 수를 입력받는다.
        int second = sc.nextInt();
        sc.nextLine();
        //3.연산기호를 입력 받는다.
        char operator = sc.nextLine().charAt(0);
        // 4.연산 기호를 확인한다.
        int result = 0;

        if (operator == '+') {
            result = first + second;
        } else if (operator == '-') {
            result = first - second;
        } else if (operator == '*') {
            result = first * second;
        } else if (operator == '/') {
            result = first / second;
        } else {
            return "연산식 오류";
        }
        return String.valueOf(result);

    }
    //  System.out.println( "*,/,+,- 구분만 적용 됩니다.")
}
    // * return "" + result ;


     // 5.연산을 진행한다.
     // 6.변환한다.
    // 7.메인에서 출력한다.
    //x 라는 수를 받고
    //수식
    //결과를 리턴해줌.



