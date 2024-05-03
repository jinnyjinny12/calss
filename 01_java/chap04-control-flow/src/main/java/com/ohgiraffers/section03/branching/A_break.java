package com.ohgiraffers.section03.branching;

public class A_break {

    /*
    * break문은 실행 흐름을 확인하기 위한 용도의 기능을 제공 분기문(break) 기본 흐름에 대해 확인
    *
    * */
    public void testSimpleBreakStatement(){

        int i = 2; // int i 를 선언해서 2로 초기회 줌
        tset: // while 문에 이름(라벨)을 정해준 것.
        while (true) { // while 의 조건식은 참일 때 실행된다. while(true) 면 종료가 된다.
            if(i>=10){
            break; // 조건문을 종료하라는 말이다.
        }
            int x = 0 ;
            while (x<=9){ //x 가 9보다 작거나 같을 때까지 무한반복.
                if(x>=10){ // 10 이 되는 순간 종료
                    break tset; // test는 이름이다. 이름에 해당되는 while 문을 종료한다.
                }

                if(x>=5){
                    break; // 나를 실행시키고 있는 이 분기(scope)를 종료한다. x가 5보다 크면 스코프가 종료됨. x 가 5보다 큰게 실행 x
                }

                if(x==0){
                    x++;
                    continue ; // 여기에 해당되면 다음 프로세스로 돌리겠다. 출력하는 구문을 건너뛴다.
                }

                System.out.println( i + " * " + x + "= "+ i*x );
                x++;
            }
            i++;
        }// 0이 안나옴.

    }

}
