package com.ohgiraffers.order.service;

import com.ohgiraffers.order.dao.OrderRepository;
import com.ohgiraffers.order.dto.OrderDTO;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderService {

    private final OrderRepository orderRepository = new OrderRepository();

    // 서비스 계층
    // 비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.
    public String order(OrderDTO[] orders){
//        if(!orderDTO.getMenuName().equals("아메리카노")){
//            return "주문 실패";
//        }
        for (OrderDTO orderDTO:orders) {
            if(orderDTO.getPrice() <= 0){
                return "땅파서 장사하냐?";
            }
        }

        String result = orderRepository.order(orders);
        return result;
    }

    public ArrayList orderRead() {
        ArrayList menuList = orderRepository.orderRead();
        return menuList;
    }

    public OrderDTO orderDetail(int no) {

        OrderDTO order = orderRepository.orderDetail(no);
        return order;

    }

    public String orderDelete(int no) {
        String result = orderRepository.orderDelete(no);
        return result;
    }
}
