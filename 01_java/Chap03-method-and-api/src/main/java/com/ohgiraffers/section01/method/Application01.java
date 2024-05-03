package main.java.com.ohgiraffers.section01.method;

public class Application01 {

    public static void main(String[] args) {

        /*
        * 메소드
        * 메소드는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */

    System.out.println("Hello World");
        Application01 app1 = new Application01();
        app1.methodA();
    System.out.println("BYE World");

    }

    public void methodA(){
        System.out.println("methodA 시작됨");
        methodB();
        System.out.println("methodA()를 종료됨");

        //Applicatio01 : 하나의 자료형으로 만들 수 있다.
    }
    public void methodB(){
        System.out.println("methodB() 시작됨");
        methodC();
        System.out.println("methodB() 종료됨");

    }

    public void methodC(){
        System.out.println("methodc () 시작됨");
        System.out.println("methodc () 종료됨");
    }


}
