package com.ohgiraffers.section03.dto.problem1;

public class Application01 {

    public static void main(String[] args) {

        //사람에 대한 정보를 관리한다.
        //재희님의 개인정보를 입력한다.

        String name = "송재희";
        char gender ='여';
        int age = 20;
        String phone = "010-1234-5678";
        String address = "인사동";

        //힙 메모리에 올려준다.
        MemberRepository memberRepository = new MemberRepository();
        memberRepository.addMember(name,gender,age,phone,address); // 입력 순서가 동일해야 한다. 자료형이 맞아야 한다.

        String name1 = "김재석";
        char gender1 ='남';
        int age1 = 19;
        String phone1 = "010-1234-5678";
        String address1 = "고잔동";

       memberRepository.addMember(name1,gender1,age1,phone1,address1);
       memberRepository.print();




    }
}
