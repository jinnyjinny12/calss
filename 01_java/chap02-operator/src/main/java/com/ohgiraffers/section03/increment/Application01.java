package com.ohgiraffers.section03.increment;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 증감연산자
        * 피연산자의 앞 or 뒤에 사용이 가능하다.
        * '++' : 1의 증가를 의미한다.
        * '--' : 1의 감소를 의미한다.
        * ++x || x++
        *
        * */

        int num = 0;
        int x = 10 +(++num);
        System.out.println(x);
        System.out.println(num);

        num = 0;
        x=10+num++;
        System.out.println(x);
        System.out.println(num);

        //10 + num =10 이 x 로 출력되고 나서 num++가 1로 증감됨.
        //그래서 x값이 10이 나오고 num 은 1이 됨.

        num = 0;
        int result = num++ * +10;
        // 1) num * 10
        // 1-1) result = o * 10 으로 출력됨
        // 2) num++1 이 되어서 1이 됨.

        System.out.println(result);

        result = num++ * 10;
        System.out.println(result);
        //



    }
}
