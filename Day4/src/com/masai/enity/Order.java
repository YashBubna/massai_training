package com.masai.enity;

import com.masai.enums.OrderStatus;

public class Order {

    int orderId;
    OrderStatus status;

    public Order(){}

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    public void printDetails(){
        System.out.println(orderId+ " is " +status);
    }
}
