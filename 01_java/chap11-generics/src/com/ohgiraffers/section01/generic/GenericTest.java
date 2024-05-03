package com.ohgiraffers.section01.generic;

public class GenericTest<T> { //<> 다이아몬드 연산자를 붙인다.

    /*
    *
    * 제네릭 설정은 클래스 선언부 마지막에 다이아몬드 연산자를 이용해서 작성하게 된다/
    * 다이아몬드 연산자 내부에 작성하는 영문자는 판례상 대문자로 작성한다.
    *
    * */


    private T value;

    public T getValue() {
        return value;
    }



    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericTest{" +
                "value=" + value +
                '}';
    }

}
