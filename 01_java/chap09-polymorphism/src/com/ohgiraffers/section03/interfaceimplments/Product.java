package com.ohgiraffers.section03.interfaceimplments;

public class Product extends Object implements InterProduct{

    /*
    *
    * 클래스에서 인터페이스르 상속받을 때는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며,
    * extends 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스도 추가 상속이 가능하다.
    * 단, extends 키워드를 앞에 작성하고 implements 를 뒤에 작성한다(순서 변경시 에러가 발생함)
    *
    * */



//    @Override
//    public static void staticMethod(){ // 메소드 또한 프로그램이 로드 될 때 메모리에 할당되기 때문에 재정의가 불가능하다
//        System.out.println("interProduct 클래스의 staticMethod 호출됨...");
//
//    }
//
//
//    @Override
//    public void nonStaticMethod() {//재정의가 물가능하다. 오직 인터페이스만 작성이 가능함.
//
//        System.out.println("interProduct 의 nonstaticMethod 오버라이딩한 메소드 호출됨... ");
//
//    }
    @Override
    public void nonStaticMethod() {
    System.out.println("interProduct 클래스의 nonstaticMethod 오버라이딩한 메서드 호출됨");
    }


    @Override
    public void absMethod() {

        System.out.println("interProduct 의 absMethod 오버라이딩한 메소드 호출됨... ");

    }
}
