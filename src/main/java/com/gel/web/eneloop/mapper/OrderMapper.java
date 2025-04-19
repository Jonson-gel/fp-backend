package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    public void createOrder(Order order);

    public Order getOrderById(int id);

    public void updateOrderState(int orderId, int state);

    public void endOrder(Order order);
}
