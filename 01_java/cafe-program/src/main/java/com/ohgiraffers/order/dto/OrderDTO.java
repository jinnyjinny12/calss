package com.ohgiraffers.order.dto;
//메뉴이름, 가격, 수량 private 하고 게터세터 투 스트링까지
public class OrderDTO {
    private String menuName;
    private int price;
    private int quantity;

    public OrderDTO() {

    }

    public OrderDTO(String menuName, int quantity, int price){
        this.menuName = menuName;
        this.quantity = quantity;
        this.price  = quantity*price;
        // 빈주문서를 생성하지 말기.
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public int getPrice() {
        return price;
    }

    //setPrice 삭제 ?

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity,int price) { // 여기다가 price 써줌
        this.quantity = quantity;
        //this.price = quantity * price

    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}