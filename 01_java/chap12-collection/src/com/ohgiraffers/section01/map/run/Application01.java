package com.ohgiraffers.section01.map.run;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /*
         * Map 인터페이스의 특징
         * Collection 인터페이스와는 다른 저장 방식을 가진다
         * 키(key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
         *
         * key(키)란?
         * 값(value) 를 찾기 위한 이름 역할을 하는 객체를 의미한다.
         * 1. 요소의 저장 순서를 유지하지 않는다.
         * 2. 키는 중복을 허용하지 않지만, 키가 다르면 중복되는 값을 저장할 수 잇다.
         *
         * hasMap, hashTable, treeMap 등의 대표적인 클래스가 있다,
         * hashMap 이 가장 많이 사용되면 HashTable 은 jdk1.0 부터 제공되며
         * HashMap 과 동일하게 동작한다. 하위 호환을 위해 남겨놓았기 때문에 가급적이면 hashMap을 사용하는 것이 좋다.
         *
         *
         *
         * */

        // hasMap jdk 1.2 부터 제공되는 클래스로 해서 알고리즘을 사용하여 검색 속도 가 매우 빠르다.
        HashMap hmap = new HashMap();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33,123);
        System.out.println(hmap);
        System.out.println(hmap.get(12));


        HashMap<Integer, String> imap = new HashMap<>();
        imap.put(1,"2");
        imap.put(2,"10");
        imap.put(3,"a");
        System.out.println(imap);
        System.out.println();

        Collection<String> values = imap.values();
        System.out.println(values);

    }



}
