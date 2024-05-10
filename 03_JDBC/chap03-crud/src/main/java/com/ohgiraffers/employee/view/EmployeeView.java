package com.ohgiraffers.employee.view;

import com.ohgiraffers.employee.Service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeView {
    private static boolean state = true;
    private static EmployeeService employeeService = new EmployeeService();

    public static void run() {

        while (state) {
            System.out.println("화면 번호를 입력해주세요 : ");
            System.out.println("1. 화면 전체보기 ");

            Scanner sc = new Scanner(System.in);
            int index = Integer.parseInt(sc.nextLine());


            switch (index) {

                case 1:
                    employeeViewAll();
                    break;

            }

            System.out.print("종료를 하시겠습니까? Yes or No");
            String result = sc.nextLine();

            if (result.equals("yes")) {
                state = false;
            }

        }

    }

    // 현재 html의 화면을 암시하고 만든 거이다.
    // view 는 사용자에게 데이터를 입력받고 서버에 전달하며 결과를 사용자에게 보여주기 위한 용도로 사용한다.

    public static void employeeViewAll(){
        System.out.println("사원 정보 전체 조회");

        try {
            ArrayList emps =employeeService.employeeViewAll();
            System.out.println(emps);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}
