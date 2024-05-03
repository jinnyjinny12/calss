package com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){ // 내가 나를 가질 수 있다.
        System.out.println("Eager 생성됨");
    }

    public static EagerSingleton getInstance(){ // 같은 주소값을 공유
        return singleton;
    }

}
