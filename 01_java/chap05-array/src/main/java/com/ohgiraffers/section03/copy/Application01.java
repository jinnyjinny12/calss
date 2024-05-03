package com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {

       //얕은 복사 : 주소값을 공유한다.

        String[] goldSideName = {"김재석","송재희","황정한"};
        System.out.println(goldSideName[0]); // 재석님을 찾고 싶을 떄 이렇게 goldSideName[0] 이라고 출력, 배열함수 적용해서
       //goldSideName 은 세명의 이름을 가지고 있는 것에 주소값을 갖고 있는 것.
        //
        String [] names = goldSideName;

        System.out.println(goldSideName); // 주소값이 나오게 함.
        System.out.println(names);

        goldSideName[0] = "김효주" ; //재석님의 자리를 효주님으로 초기화 함
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);
        System.out.println("========깊은 복사 ============");

        //----------
        //깊은 복사에 대한 개념
        goldSideName = new String[] { "김재석", "송재희", "황정한"}; // 변수명을 할당하는 것이 불편패서 임시로 재사용.

        //for each
        // for 문은 반복문이다. 대상 배열의 length 만큼 반복.
        // for (int i = 0;, i < goldSideName.length;i++){
        // String name = goldSideName[]
        // System.out.println()~?
        // }


        //for each 문
        int i = 0 ;
        for (String name : goldSideName) {
            names[i] = name; // name 값을 다 초기화하고 ?
            i++;
        }

        goldSideName[0]= "이상우";
        System.out.println(goldSideName[0]);
        System.out.println(names[0]);// 이렇게 써도 이상우가 아니라 김재석이 나옴. 깊은 복사의 특징**


        for (String name : names) {
            System.out.println(name);
        }





    }
}
