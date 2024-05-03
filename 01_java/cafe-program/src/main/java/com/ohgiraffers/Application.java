package com.ohgiraffers;

import com.ohgiraffers.order.controller.OrderController;
import com.ohgiraffers.order.dto.OrderDTO;

import java.awt.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Order 컨트롤러를 불러오기 위해서 만들어줘야 한다.
        OrderController orderController = new OrderController();

        boolean order = true;
        String result = ""; // String 추가

        while(order) {

            System.out.println("1. 주문 등록");
            System.out.println("2. 주문 삭제");
            System.out.println("3. 주문 수정");
            System.out.println("4. 주문 상세조회");
            System.out.println("5. 주문 전체조회");
            System.out.print("어떤 메뉴를 동작하시겠나요?");
            int input = sc.nextInt();
            sc.nextLine();
            // OrderDTO orderDTO = new OrderDTO(); // 오더 디티오를 입력 - 수량 * 가격 만들어준 후에

            switch(input){
                case 1: //주문등록
                    //사용자가 주문할 수 있게 로직이 필요함. -> Menu를 넣기 위해 menu 패키지 만들고 Menu 클래스 만듬.-1

                    System.out.println("주문할 메뉴 이름을 등록해주세요:");
                    String menuName = sc.nextLine();
                    //orderDTO.setMenuName(se.nextLine();

                    System.out.println("수량을 등록해주세요:");
                    int quantity = sc.nextInt();

                    System.out.println("가격을 등록해주세요:");
                    int price = sc.nextInt();

                    OrderDTO orderfinal = new OrderDTO (menuName,quantity,price);
                    result =  orderController.order(orderfinal); // 하이퍼텍스트 프로토콜에 내용을 전달?
                    System.out.println(orderfinal);

                    break;

                case 2: // 주문삭제
                    orderController.orderDelete();
                    break;
                case 3: // 주문수정
                    orderController.orderModi();
                    break;
                case 4: // 주문 상세조회 :  내가 원하는 거 한 개만 조회하기

                    //1)
                    //2) 저장된 정보와 주문번호를 매칭될 수 있게 저장된다.
                    //3) 조회하고 싶은 주문 번호를 입력한다.
                    //2) 입력한 주문 번호의 주문 내용을 출력한다.

                    OrderDTO orderDTO = new OrderDTO();
                    System.out.println("조회할 메뉴를 입력하세요");
                    orderDTO.setMenuName(sc.nextLine());
                    result = orderController.orderDetail(orderDTO);

                    break;

                case 5: // 주문 전체조회 : 주문한 거가 모두 나오는 것

                    //1) 주문을 등록한다
                    //2) 등록한 주문을 조회한다.
                    //3) 메뉴이름, 가격, 수량
                    orderController.orderRead();

                    break;

                default:
                    System.out.println("입력이 잘못되었습니다.");

            }

            System.out.println(result);

            System.out.print("주문을 종료하시겠나요?");
            order = sc.nextBoolean();


        }
    }


}