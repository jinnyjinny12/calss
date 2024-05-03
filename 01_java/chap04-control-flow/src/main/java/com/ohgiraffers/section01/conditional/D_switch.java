package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

//D_switch 라는 클래스를 모두가 사용할 수 있도록 한다.
public class D_switch {//D_switch 시작

    public static void main(String[] args) {
        D_switch ds = new D_switch();
        //  D_switch 라는 클래스를 메모리에 올린다.

    }

    public double testSimpleSwitchStatement() { // testSimpleSwitch 매서드의 시작
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번째 정수 입력 : ");
        int first = sc.nextInt();

        System.out.println("두 번째 정수 입력 : ");
        int second = sc.nextInt();

        System.out.println("연산 기호 입력");

        char op = sc.next().charAt(0);
        double result = 0.0;

        switch (op) {
            case '+':
                System.out.println(first + second);
                break;
            case '-':
                System.out.println(first - second);
                break;
            case '*':
                System.out.println(first * second);
                break;
            case '/':
                System.out.println(first / second);
                break;
            default:
                System.out.println("연산 불가");
                break;

        }
        return 0.0;
    } // testSimpleSwitch 매서드 종료
} //


    //계산기를 만들고 결과를 반환합니다.(switch를 이용함) 변환된 결과는 application02 에서 출력해주세요
    // + - / * 만 제공하고 일하는 연산이 없는 경우 연산 불가라는 결과를 출력하고 반환값을 0.0으로 합니다.



    //등급 계산기 프로그램 if
    //main에서 학생의 성적을 입력받고 아래 매서드에서 학생의 등급을 화면에 출력해주세요
    //100=a+
    //100~90 = a
    //90~85 = b+
    //85~75 =b
    //75~60=c
    //60 미만은 D
    //F는 없다.

    //<접근 방법>
    //1. main 에서 학생의 성적을 입력한다/.
    //2. if 연산이 수행된다.
    //3. 여기에 맞는 등급이 나타난다.
    //4.
//  /  public void gradeCal(int num ){
//        String grade ; // grade 로 선언한다.
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("학생의 성적을 입력해주세요");
//        int num = sc.nextInt();
//
//        if(num == 100) {
//            System.out.println("a+");
//        }else if (num < 100 && num>=90) {
//            System.out.println('a');
//        }else if (num < 90 && num>=85) {
//            System.out.println("b+");
//        }else if (num < 85 && num>=75) {
//            System.out.println('b');
//        }
//        else if (num < 75 && num>=65) {
//            System.out.println("c+");
//        }else if (num < 60) {
//            System.out.println('D');
//        }else {
//            System.out.println( num + "해당 성적이 없습니다");
//        }
//
//        return String.valueOf(num);
//
//    }
//
//
//
//} //D-switch 의 종료
//
//
//

