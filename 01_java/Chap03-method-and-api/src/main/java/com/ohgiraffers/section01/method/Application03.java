package main.java.com.ohgiraffers.section01.method;

import java.awt.desktop.AppForegroundListener;

public class Application03 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        Application03 app3 = new Application03();
        int result = app3.plus(x,y);
        System.out.println(result);

        int result1 = app3.minus(x,y);
        System.out.println(result1);

        int result3 = app3.mulitply(x,y);
        System.out.println(result3);

        int result4 = app3.divide(x,y);
        System.out.println(result4);

        int result5 = app3.modulo(x,y);
        System.out.println(result5);

        String result10 = app3.myInfo("jinny", 1, '여',"010-1234-1234");
        //app3.myInfo("jinny", 1, '여',"010-1234-1234");
        System.out.println(result10);
        System.out.println(app3.myInfo("jinny",1,'여',"010-1234-1234"));


    }
    public String myInfo(String name, int age, char gender, String phone) {
        String result = name + " " + age + " " + gender + " " + phone;
        return result;
    }

    //더하기 함수
    //접근제어자 + 반환 타입 + 함수명(매개변수){}
    //public + int + plus
    public int plus (int x, int y) {
        int result = x + y;
        return result;

    }

    public int minus (int x, int y) {
        int result = x - y;
        return result;

    }

    public int mulitply (int x, int y) {
        int result = x * y;
        return result;
    }

    public int divide (int x, int y) {
        int result = x / y;
        return result;
    }

    public int modulo (int x, int y) {
        int result = x % y;
        return result;
    }

    /*
    * myinfo함수를 만들고
    * 이름 : 문자열
    * 나이 : 정수
    * 성별 : 문자
    * 전봐번호 : '-' 을 포함한 전화변호
    *
    * 이 4개의 자료형을 매개변수로 받아 main에서 출력해주세요.
    *
    * */

    /*
    * 1.myinfo 라는 함수를 만든다.
    * 2.매개변수 (String name, int age, char gender, String phone)
    * 3.매개변수를 더해준다. String result = name + age + gender + phone
    * 4. return result (string)
    *
    * */








}
