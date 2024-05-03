package com.ohgiraffers.order.dao;

import com.ohgiraffers.order.dto.OrderDTO;
import com.ohgiraffers.order.fakeDB.OrderDB;

import java.util.ArrayList;

public class OrderRepository {

    //1)final : 주문서를 저장하는 곳이 바뀌면 안되기 때문에 final 을 붙임.

    private final ArrayList orders = new ArrayList(); // private 붙이면 초기화 불가능, 다른 손님들이 영수증 못붙게 됨.

    public String order(OrderDTO orderDTO) {
        //0
        int oldNum = orders.size();

        orders.add(orderDTO); // 주문서를 등록해주고 있다/.


        //1
        //int current =orders.size(); // 지우심
        if (oldNum >= orders.size()) {
            return  "등록 실패";
        }

        return " 등록 성공";
    }


    public String orderDetail() {

        System.out.println(orders);
        boolean view = orders.contains(toString());
        if (!view == orders.contains(toString())) {
            return "조회실패";
        }

        return "조회성공";
    }

    public ArrayList orderRead (){
        return OrderDB.getOrders();

    }
