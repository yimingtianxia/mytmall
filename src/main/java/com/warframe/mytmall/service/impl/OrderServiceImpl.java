package com.warframe.mytmall.service.impl;

import com.warframe.mytmall.dao.OrderDAO;
import com.warframe.mytmall.pojo.Order;
import com.warframe.mytmall.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by warframe on 2017/6/3.
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService{


    //要完成自动装配，需要在对应的dao抽象接口前添加@Repository注解
    @Resource
    private OrderDAO orderDAO;


    @Override
    public Order getOrderById(int id) {
        return orderDAO.getById(id);
    }

    @Override
    public void addOrder(Order order) {
        orderDAO.add(order);
    }

    @Override
    public int getTotalNumber() {
        return orderDAO.getTotalNumber();
    }

    @Override
    public List<Order> getOrders() {
        return orderDAO.listAll();
    }

    @Override
    public void deleteOrder(int id) {
        orderDAO.delete(id);
    }

    @Override
    public List<Order> list(int start, int count) {
        return orderDAO.list(start,count);
    }
}
