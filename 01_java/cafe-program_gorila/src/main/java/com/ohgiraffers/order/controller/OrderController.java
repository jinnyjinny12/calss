package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderController {

    private final OrderService orderService = new OrderService();

    public String order(OrderDTO[] orders){
        // 컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        for (OrderDTO orderDTO: orders) {
            if(orderDTO.getMenuName().equals("")){
                return "메뉴를 정해주세요";
            }

            if(orderDTO.getQuantity() <= 0){
                return "수량을 입력해주세요";
            }
        }


        // service 로직으로 넘김
        String result = orderService.order(orders);
        return result;
    }

    public String orderModify(){
        return "주문수정";
    }

    public  String orderDelete(int no){
        String result = orderService.orderDelete(no);

        return result;
    }

    public String orderRead(){
        ArrayList orderList = orderService.orderRead();
        String result = "주문 목록 : " + orderList.toString();
        return result;
    }

    public String orderDetail(int no){
        if(no < 0){
            return "메뉴 번호를 잘못 입력하였습니다.";
        }
        OrderDTO orderDTO = orderService.orderDetail(no);
        if(orderDTO == null){
            return "존재하지 않는 주문입니다.";
        }

        return orderDTO.toString();
    }
}
















