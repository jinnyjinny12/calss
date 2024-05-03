package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class paracitce3 {
    public static void main(String[] args) {
        paracitce3 pt3 = new paracitce3();

    }


    //한번에 연산식 입력받기
    public String call() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] target = input.split(" ");
        int result = 0;//=0 을 안쓰면 오류남

        if (target[1].equals("+")) {
            result = Integer.parseInt(target[0]) + Integer.parseInt(target[2]);
        }

        String a = "1";
        String b = "1";

        return "" + result;
    }
}