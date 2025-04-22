package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.mapper.OrderMapper;
import com.gel.web.eneloop.pojo.Order;
import com.gel.web.eneloop.pojo.PowerBank;
import com.gel.web.eneloop.service.OrderService;
import com.gel.web.eneloop.service.PowerBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PowerBankService powerBankService;

    @PostMapping("/power_bank/rent/{id}")
    @ResponseBody
    public Map<String, Object> rentPowerBank(@PathVariable("id") int powerBankId) {
        // 示例：用户ID写死为1
        int userId = 1;

        // 更新充电宝状态（假设你已有此方法）
        powerBankService.updatePowerBankState(powerBankId, 2);

        int orderId = orderService.createOrder(userId, powerBankId);

        // 成功时返回订单 ID
        Map<String, Object> result = new HashMap<>();
        result.put("orderId", orderId);
        return result;
    }

    @PostMapping("/order/return/{id}")
    @ResponseBody
    public Map<String, Object> returnOrder(@PathVariable("id") int orderId) {
        Order order = orderService.getOrderById(orderId);

        int endTime = (int)(System.currentTimeMillis() / 1000);
        int durationMinutes = (endTime - order.getStartTime()) / 60;
        int fee = (durationMinutes/60 + (durationMinutes%60 != 0 ? 1 : 0))*2;

        order.setEndTime(endTime);
        order.setFee(fee);
        order.setOrderState(2);

        orderService.endOrder(order);

        Map<String, Object> result = new HashMap<>();
        result.put("fee", fee);
        return result;
    }

    @GetMapping("/order/{id}")
    @ResponseBody
    public Order getOrderById(@PathVariable("id") int orderId){
        return orderService.getOrderById(orderId);
    }

    @GetMapping("/order/user/{id}")
    @ResponseBody
    public List<Order> getOrderByUserId(@PathVariable("id") int userId){
        return orderService.getOrderByUserId(userId);
    }
}
