package com.ohgiraffers.Section04.overflow;

public class application01 {
    public static void main(String[] args) {

        //자료형 별 값의 최대 범위를 벗어나는 경우 발생한 carry를 바람처리 하고 sin bin을 반전시켜 최소값으로 순환시킴.

        byte num1 = 127;
        System.out.println("byte num : " + num1);
        num1++;
        System.out.println("byte num : " + num1);

        int firstNum = 100000000;
        int secondNum = 70000000;
        int multi = firstNum * secondNum;
        System.out.println("int firstNum * SecondNum = " + multi);
        //

        long longMulti  = firstNum * secondNum;
        System.out.println("long firstNum * secondNum = " + longMulti);

        long result = (long) firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + result);

    }

}
