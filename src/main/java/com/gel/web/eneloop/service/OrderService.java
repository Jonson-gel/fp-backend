package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.Order;

import java.util.List;

public interface OrderService {
    public int createOrder(int userId, int powerBankId);

    public Order getOrderById(int id);

    public void updateOrderState(int orderId, int state);

    public void endOrder(Order order);

    public List<Order> getOrderByUserId(int userId);
}
