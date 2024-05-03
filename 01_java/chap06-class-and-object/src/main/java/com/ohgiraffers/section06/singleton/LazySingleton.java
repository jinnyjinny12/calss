package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    private LazySingleton() {

        System.out.println("Lazy 생성됨");
    }
    public static LazySingleton getInstance() {
        //조건이 들어감 =null : 아직 생성되지 않았다는 것을 의미
        if (lazy == null) {
            lazy = new LazySingleton();
        }
        return lazy;
    }

}
