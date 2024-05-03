package com.ohgiraffers.section02.looping;

public class B_while {

    public void testSimpleWhileStatement(){

        /*
         *[while문 표현식]
         * 초기식
         * while(조건식){
         *  조건식을 만족하는 겨우 수행할 구문(반복할 구문);
         *  증감식;
         *
         * }
         *
         * while(조건식){
         *  조건식을 만족하는 겨우 수행할 구문
         * }
         */

         /*
         * 1. while 의 조건식을 어떻게 만들지?
         *  1-1. i를 정해준다
         *  1-2. while ( 조건문)
         *      조건문 형식은 i의 범위를 정해준다 : 구구단이니까 10 이전까지만 범위를 정함.
         *      구구단에 곱해지는 숫자가 두 개니까  j 라는 하나의 변수를 더 정해준다.
         *      int j = 1;
         *      그 j의 범위를 while 함수로 지정해준다
         *             (i*j) 출력한다
         *      j++ 씩 높여준다.

         * 2. 출력식은 i*j? 임?
         *
         * 구구단을 만든다.
         * 9x9 라는 형식을 만드는 건다.
         *
         *
         * */

        int i = 1;
        while ( i < 10 ) { //반복해야 하는 대상의 길일 때 알 수 없을 때 사용한다.
            int j = 1;
            while ( j<= 9) {
                System.out.println( i+ " x" + j + " = " + i*j);
                j++;
            }
            i++;
        }

      }

    public void whileGugudan(){
        // 1.초기식 작성
        int i = 1;
        // 2. while 문의 조건식
        while ( i < 10 ) { // while의 시작
            // 3.중첩 while 조건식
            int j = 2;
            while (j <=9) {
                // 4.i*j 연산
                // 5.출력
                System.out.println(i * j);
                //6. 중첩 while 증감식
                j++;
            } // 7.while 증감식 종료
        i++;
        }//종료


    }

    }
