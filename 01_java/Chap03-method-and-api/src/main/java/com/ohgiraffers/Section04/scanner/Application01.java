package main.java.com.ohgiraffers.Section04.scanner;

import main.java.com.ohgiraffers.section01.method.Application03;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //sc 변수명 == 메모리주소 == 값
        //가용성이 좋은 메모리 공간 == heap

//        System.out.println("당신의 이름을 입력해주세요 : ");
//        String name = sc.nextLine();
//        //nextline : 사용자에게 입력값을 받아서 문자열로 반환해주는 함수. 숫자를 입력해도 문자열로 받음.
//        System.out.println("입력하신 당신의 이름은 " + name + " 입니다. ");
//
//        System.out.println("당신의 나이를 입력해주세요 : ");
//        int age = sc.nextInt();
//        System.out.println("당신의 나이는 " + age+ "세 입니다");


        Application01 app1 = new Application01();
        String info = app1.inputInfo();
        System.out.println(info);

        /*
        * inputInfo 매서드를 만들고
        * 사용자 이름 키 성별 나이를 입력받아 main 에서 출력해주세요
        * */

        //1.inputinfo 라는 함수를 만들어야 함.
        //    접근제어자 반환타입(String) 매서드형(){}
        //2.사용자에게 값을 입력받는다.
        // Scanner sc = new Scanner ()
        //3.키 나이 성별 이름을 입력받아 문자열로 합친다.
        //  doulble 키,
        //  정수(int) 나이
        //  문자 성별
        //  문자열 이름;
        //4.문자열로 반환한다.
        // return

//        String name = sc.nextline();
//        System.out.println();

    }
    public String inputInfo() {

        Scanner sc = new Scanner(System.in);

        System.out.println(" 당신의 키는 몇인가요? ");
        double height = sc.nextDouble();

        System.out.println(" 당신의 나이는 몇인가요? ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println(" 당신의 성별은 무엇인가요? ");
        char gender = sc.nextLine().charAt(0);

        System.out.println(" 당신의 이름은 무엇인가요? ");
        String name = sc.nextLine();

        return "당신의 이름은 " + name + "입니다. \n" + "당신의 나이는 " + age + "입니다. \n" + "당신의 키는 " + height + "입니다. \n" + "당신의 성별은 " + gender + "입니다. \n";

        }

}
