package com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 데이터 형변환
        * 데이터 형변환이 필요한 이유
        * -자바에서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다.
        * 즉, 같은 데이터 타입끼리만 연산을 수행할 수 있다.
        *
        * */

        /*
        * 형변환의 종류와 규칙
        * 1. 자동변환(묵시적 형변환) : 컴파일러가 자동으로 수행해주는 타입 변환
        *   1-1. 작은 자료형에서 큰 자료형으로는 자동 형변환 된다.
        *   1-2. 정수는 실수로 자동 형변환 된다.
        *   1-3. 문자형은 int형으로 자동 형변환 된다.
        *   1-4. 논리형은 형변환 규칙에서 제외된다.
        * 2. 강제형변환은 (명시적 형변환) : 형변환(cast) 연산자를 이용한 강제적으로 수행하는 형변환
        *   2-1. 자동형변환이 적용되지 않는 경우 강제 형변환이 필요하다.
        *   int a = 9L +10 오류
        *   long a = 9L + 10L 정상
        *
        * */


        /*
        * 형변환:
        *byte bnum = 1;: byte 변수 bnum을 1로 초기화합니다.
        * short snum = bnum;: bnum의 값을 short 변수 snum에 할당합니다. 이 때, byte에서 short으로의 형 변환이 일어납니다.
        * int inum = snum;: snum의 값을 int 변수 inum에 할당합니다. 이 때, short에서 int으로의 형 변환이 일어납니다.
        * long lnum = inum;: inum의 값을 long 변수 lnum에 할당합니다. 이 때, int에서 long으로의 형 변환이 일어납니다.
        *
        * 자바의 데이터 타입의 크기가 작은 것에서 큰 것으로 이동할 때 자동으로 발생합니다.
        * */

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /*설명. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다.*/
        int num1 = 10;
        long num2 = 20;

        //int result1 =num1 + num2;
        //자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result1 = num1 + num2;
        //int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int -> long 변환을 자동 수행 후 연산한다.
        //따라서 long 타입 변수가 result 에 저장된다.

        System.out.println("result1 : " + result1); // 정상수행됨

        /*목차. 1-1-2. 실수끼리의 자동 형변환*/
        float fnum = 4.0f;
        double dnum = fnum;

        /*설명. 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산된다.
        * dnum 은 double 타입이기 때문에 result2에 할당할 때 추가적인 형변환이 필요하지 않음.
        * */
        double result2 = dnum;

        System.out.println("result2 : " + result2); //정상수행됨

        /*목차. 1-2. 정수는 실수로 자동 형변환 된다.*/
        /*필기
        * 정수를 실수로 변경할 때 수수점 자리수가 없어도 실수형태로 표현이 가능하다. 이때 데이터 손실이 없기 때문에
        * 자동 형변환이가능하다.
         */

        /*설명
        * 실제 값을 저장하는 매커니즘을 가진 것과 달리 실수형은 지수부와 가수부를 따로 나눠서 작성하기 때문에,
        * 바이트 크기보다 훨씬 더 많은 값을 표현할 수 있다.*
        * */

        //long eight = 888888888888888888;
        //이것도 지동으로 형변환 된 것이다. (int 범위 벗어나면 에러 발생)
        long eight = 8;
        float four = eight;

        System.out.println("four : " + four);

        /*설명. 따라서 실수와 정수의 연산은 실수로 연산 결과가 반환된다.
         */
        float result3 = eight + four;
        System.out.println("result3 : " + result3);

        /*
        * 목차. 1.-3. 문자형은 int형으로 자동 형변환 된다
        * */
        char ch1 = 'a';
        int charNumber = ch1;

        System.out.println("charNumber : " + charNumber);

        /*
        * 설명.int로 type이 정해지지 않은 리터럴 형태의 정수는 char 형 변수에 기록 가능하다.
        *
        * */
        System.out.println("charNumber : " + charNumber);

        /*설명. int로 type이 정해지지 않은 리터럴 형태의 정수는 char형 변수에 기록 가능하다.
        * */
        char ch2 = 65;
        System.out.println("ch2 : " + ch2);

        /*목차.1-4.논리형은 형변환 규칙에서 제외된다.*/
        /*필기. 어느 자료형이든 boolean을 형변환해서 담을 수 없다.*/

        boolean isTrue = true;
        //byte b = isTure;
        //shorts = isTure;
        //long I = is Ture;
        //char c = isTure;
        //float f = isTure;
        //double d = isTure;

    }
}

