package com.ohgiraffers.section01.polymorphim;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다~~~~~");
    }

    @Override
    public void cry() { // 애니몰의 크라이를 재정의한다.

        System.out.println("토끼가 울음소리를 냅니다");
    }

    public void jump() { // 토끼만 가지고 있는 매서드
        System.out.println("토끼가 점프합니다");
    }
}
