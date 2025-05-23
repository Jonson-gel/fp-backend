package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gel.web.eneloop.mapper.OrderMapper;

import java.util.List;

@Service
public class OrderImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public int createOrder(int userId, int powerBankId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setPowerBankId(powerBankId);

        // 当前时间的秒级时间戳
        int timestamp = (int) (System.currentTimeMillis() / 1000);
        order.setStartTime(timestamp);

        order.setOrderState(1); // 进行中
        orderMapper.createOrder(order);

        return order.getOrderId();
    }

    @Override
    public Order getOrderById(int id){
        return orderMapper.getOrderById(id);
    }

    @Override
    public void updateOrderState(int orderId, int orderState){
        orderMapper.updateOrderState(orderId, orderState);
    }

    @Override
    public void endOrder(Order order){
        orderMapper.endOrder(order);
    }

    @Override
    public List<Order> getOrderByUserId(int userId){
        return orderMapper.getOrderByUserId(userId);
    }
}
