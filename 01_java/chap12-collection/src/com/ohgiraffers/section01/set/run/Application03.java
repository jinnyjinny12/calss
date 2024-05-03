package com.ohgiraffers.section01.set.run;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application03 {

    public static void main(String[] args) {
        /*
        * treeSet 클래스
        * Treeset 클래스는 데이터가 저장된 상태로 저장되는 이진 검색 트리의 형태로 요소를 저장한다.
        * 이진 검색 트리는 데이터를 추가하거나 제거ㅏ는 등의 기본 동작 시간이 매우 빠르다.
        * jdk 1.2부터 제공되고 있으며
        * Set 인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
        *
        * */

        TreeSet<String> test = new TreeSet<>();
        Set<String> test2 = new TreeSet<>();
        test.add("java");
        test.add("oracle");
        test.add("jdbc");
        test.add("html");

        System.out.println(test);

        System.out.println("test2");
        test2.add("java");
        test2.add("oracle");
        test2.add("jdbc");
        test2.add("html");
        System.out.println(test2);




    }
}
