package com.warframe.mytmall.service;

import com.warframe.mytmall.pojo.Order;

import java.util.List;

/**
 * Created by warframe on 2017/6/3.
 */
public interface OrderService {

    Order getOrderById(int id);

    void addOrder(Order order);

    int getTotalNumber();

    List<Order> getOrders();

    void deleteOrder(int id);
    //void updateUser(Order order);

    List<Order> list(int start, int count);
}
