package com.ohgiraffers.section01.polymorphim;

public class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯습니다");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 달지 않습니다");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다");
    }

    public void bite(){ // 호랑이라는 클래스만 가지고 있는 매서드
        System.out.println("호랑이가 물어뜯습니다");
    }

}
