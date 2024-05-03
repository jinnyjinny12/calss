package com.ohgiraffers.order.controller;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.service.OrderService;

public class OrderController {

    //3)final
    private final OrderService orderService = new OrderService(); //서비스 로직으로 넘기기 위해서 -3

    public String order(OrderDTO orderDTO){// Application -orderdto 를 넣어줘야 함.2
        // order = 어플리케이션에서 전달한 order
        //컨트롤러 계층에서는 각 기능을 수행하기 위한 필수값의 누락이 있는지 검사한다.
        if(orderDTO.getMenuName().equals("")) {
            return "주문을 입력해주세요";
        }

        if(orderDTO.getQuantity()<=0){
            return "수량을 입력해주세요";
        }
        //service 로직으로 넘김 -3
        String result = orderService.order(orderDTO);
        return result ; //"주문하기"
    }
    public String orderModi(){
        return "수정하기";
    }

    public String orderDelete(){
        return "삭제하기";
    }

    public String orderRead() {
        return "조회하기";
    }

    public String orderDetail () {

        return "상세조회하기";
    }


}