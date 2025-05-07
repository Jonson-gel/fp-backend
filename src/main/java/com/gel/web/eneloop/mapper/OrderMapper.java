package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    public void createOrder(Order order);

    public Order getOrderById(int id);

    public void updateOrderState(int orderId, int orderState);

    public void endOrder(Order order);

    public List<Order> getOrderByUserId(int userId);
}
