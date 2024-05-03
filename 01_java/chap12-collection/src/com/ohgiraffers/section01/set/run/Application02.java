package com.ohgiraffers.section01.set.run;

import java.util.LinkedHashSet;

public class Application02 {

    public static void main(String[] args) {
        /*
        * LinkedHashSet
        * hashSet이 가지는 기능을 모두 가지고 있고
        * 추가적으로 저장 순서를 유지하는 특징을 가지고 있다.
        *
        * */

        LinkedHashSet<String> lhset = new LinkedHashSet<>();
        // 순서대로 출력한다.
        lhset.add("java");
        lhset.add("oracle");
        lhset.add("jdbc");
        lhset.add("html");
        System.out.println(lhset);


    }

}
