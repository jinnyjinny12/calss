package main.java.com.ohgiraffers.section02.package_and_import;


import main.java.com.ohgiraffers.section01.method.calculator;
import java.util.Calendar;

import static main.java.com.ohgiraffers.section01.method.calculator.MaxNumberOf;

public class Application01 {
    public static void main(String[] args) {

        int first = 200;
        int second = 300;

        int max = main.java.com.ohgiraffers.section01.method.calculator.MaxNumberOf(first, second);
        int max1 =MaxNumberOf(first,second);
        System.out.println(max);
        System.out.println(max1);

        calculator cal = new calculator();
        int min = cal.MinNumberOf(first,second);
        System.out.println(min);

    }

}
