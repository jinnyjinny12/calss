package com.ohgiraffers.section01.user_type;

public class Application01 {

    public static void main(String[] args) {

        String id = "정한1";
        String pwd = "pass01";
        String name ="황정한";
        int age = 20;
        char gender = '남';
        String [] hobby = new String []{"축구", "헬스", "런닝"};

        String id2 = "재희1";
        String pwd2 = "pass02";
        String name2 ="송재희";
        int age2 = 22;
        char gender2 = '여';
        String [] hobby2 = new String []{"걷기", "릴스시청", "인사동"};

        //------------
        Member hwang = new Member();
        Member song = new Member();

        hwang.id = "정한"; // hwang 이 참조하고 있는 id 속성에 "정한" 이라는 값을 넣어줌.
        song.id = "재희"; // 한 줄 한 줄이 하나의 인스턴스이다.

        hwang.pwd = "pass01";
        song.pwd = "pass02";

        hwang.name = "황정한";
        song.name = "송재희";

        hwang.gender = '남';
        song.gender = '여';

        hwang.age = 20;
        song.age = 22; // song 이라는 객체를 통해 song 의 나이가 hwang 보다 많음을 알 수 있다.


        hwang.hobby = new String[]{"축구", "헬스", "런닝"};
        song.hobby = new String[]{"걷기", "릴스시청", "인사동"};

        //hwang 을 출력하면 주소값이 나옴 :com.ohgiraffers.section01.user_type.Member@7a81197d
        //hwang.id 를 출력하면 정한이 나옴.
        // Member 에 toString 을 쓰고 hwang 을 출력하면 Member {id=정한', pwd=pass01', name=황정한', age=20, gender =남, hobby=[축구, 헬스, 런닝]}

        System.out.println(hwang);







    }

}
