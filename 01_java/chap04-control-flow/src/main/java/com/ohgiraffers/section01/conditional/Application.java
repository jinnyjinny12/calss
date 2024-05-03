package com.ohgiraffers.section01.conditional;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 수를 입력하세요: ");
        double num1 = scanner.nextDouble();

        System.out.println("두 번째 수를 입력하세요: ");
        double num2 = scanner.nextDouble();

        System.out.println("연산 기호를 입력하세요 (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        //입력된 연산 기호에 따라 계산 수행
        if (operator == '+') {
            result = num1 + num2;
        }else if (operator == '-') {
            result = num1 - num2;
        }else if (operator == '*') {
            result = num1 * num2;
            if(num2 == 0){
                System.out.println("0으로 나눌 수 없습니다.");
                return;
            }
            result = num1 / num2;
        }else{
            System.out.println("잘못된 연산 기호입니다.");
            return;
        }
        System.out.println("결과 : " + result);

//
//    public static void main(String[] args) {
//       A_if aif = new A_if();
//        aif.testSimpleIfStatement();

//        System.out.println("Hello World");

    }



    /*
    *계산기 만들기
    * 두 수와 연산기호를 입력받아
    * 수식에 맞는 연산을 수해하는 프로그램을 만들어주세요.
    * 1) 함수를 만든다.
    * 2) 두 수를 입력한다.
    * 3) 출력한다.
    * <접근방법>
     * 1.calculator 매서드를 만든다. 실수로 만드는 거 추천 double
     * public double? calculator(){
     * public string? calculator()
     * //입력받을 수 잇는 기능을 추가한다
     * Scanner sc = new Scanner(System.in);
     *
     * 2.첫번째 수를 입력받는다.
     *
     * int first = sc.nextInt();
     *
     * 2-1. 두번째 수를 입력받는다.
     * int second = sc.nextInt();
     * 3.연산기호를 입력 받는다.
     * char operator =sc.nextLine().charAt(0);
     *
     * 4.연산 기호를 확인한다.
     * double result;
     *  if(operator == +){
     *   result = first + second;
     * }else if (operator == '-'){
     *   result = first*second;
     * }else(operator == '/'){
     *   result = first/second
     * }else{
     *  return "연산식 오류";
     *
     *  System.out.println( "*,/,+,- 구분만 적용 됩니다.")
     *}
     * return "" + result ;
     * return String.valueOf(result);
     *
     *
     * 5.연산을 진행한다.
     * 6.변환한다.
     * 7.메인에서 출력한다.
    ** }
    * x 라는 수를 받고
    * 수식
    * 결과를 리턴해줌.
    *
    * 매서드는 클래스 안에 있어야 한다.
    * */


    }





