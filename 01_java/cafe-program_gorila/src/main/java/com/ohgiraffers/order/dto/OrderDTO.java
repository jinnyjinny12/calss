package com.ohgiraffers.order.dto;

public class OrderDTO {
    private String menuName;
    private int price;
    private int quantity;

    public OrderDTO(String menuName, int price, int quantity) {
        this.menuName = menuName;
        this.price = quantity * price;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity, int price) {
        this.quantity = quantity;
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
