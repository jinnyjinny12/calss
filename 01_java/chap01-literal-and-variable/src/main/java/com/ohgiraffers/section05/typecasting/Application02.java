package com.ohgiraffers.section05.typecasting;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 강제형변환
        * 바꾸려는 자룡으로 캐스트 연산자를 이용하여 형변환된다.
        *
         */

        /*
        * 자동형변환 규칙의 반대 상황에서 강제 형변환이 필요하다.
        * 1. 강제 형변환 규칙
        *   1-1. 자료형에서 작은 자료형으로 변경시 강제 형변환이 필요하다.
        *   1-2. 실수를 정수로 변경 시 강제 형변환이 필요하다.
        *   1-3. 문자형을 int 미만 크기의 변수에 저장할 때 강제 형변환이 필요하다.
        *   1-4. 논리형은 강제 형변환 규칙에서 제외된다.
        *
        * */


        byte num = 1;
        char charAt = 'A'; // 문자는 정수로 변환이 가능하다.
        //자바에서 정수를 취급하는 기본단위는 int
        //문자는 == 정수 == int

        long lnum = 9L;
        int inum = (int)lnum;
        short snum = (short)inum;
        byte bnum = (byte)snum;

        //자동 형변환이 발생된다.
        snum = bnum;

        // ---------------------
        //실수형의 형변환
        double dnum = 8.8;
        float fnum = (float)bnum;

        // -----문자형을 int 미만의 크기 변수에 저장할 때 강제 형변환이 필요하다.
        char ch = 'a'; // char 10byte : 문자는 숫자로 표현이 가능하다.// 문자 a를 정수로 변환시 97이다.
        byte bnum2 = (byte)ch; // 1byte : byte는 정수를 담는 자료형이다. 기본적인 정수의 자료형은 int(4byte)고 현재 int를 byte 로 넣으려고 한 것.

        int result = ch;
        System.out.println(bnum2);











    }



}
