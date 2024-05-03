package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        calculator cal = new calculator();
        int min = cal.MinNumberOf(first,second);
        System.out.println(min);

        int max = calculator.MaxNumberOf(first,second);
        System.out.println(max);


    }
}
