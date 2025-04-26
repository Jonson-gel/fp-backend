package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.Order;
import com.gel.web.eneloop.pojo.Payment;
import com.gel.web.eneloop.service.OrderService;
import com.gel.web.eneloop.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Autowired
    private OrderService orderService;

    @PostMapping("/payment/rent/{userId}/{orderId}")
    @ResponseBody
    public void rentPayment(@PathVariable("userId") int userId, @PathVariable("orderId") int orderId){
        Order order = orderService.getOrderById(orderId);
        paymentService.createPayment(userId, order, 1);
    }

    @PostMapping("/payment/top_up/{userId}/{amount}")
    @ResponseBody
    public void topUpPayment(@PathVariable("userId") int userId, @PathVariable("amount") int amount){
        paymentService.createTrans(userId, amount, 2);
    }

    @PostMapping("/payment/withdraw/{userId}/{amount}")
    @ResponseBody
    public void withdrawPayment(@PathVariable("userId") int userId, @PathVariable("amount") int amount){
        paymentService.createTrans(userId, amount, 3);
    }

    @PostMapping("/payment/refund/{userId}/{amount}")
    @ResponseBody
    public void refundPayment(@PathVariable("userId") int userId, @PathVariable("amount") int amount){
        paymentService.createTrans(userId, amount, 4);
    }

    @GetMapping("/payment/{userId}")
    @ResponseBody
    public List<Payment> getPaymentByUserId(@PathVariable("userId") int userId){
        return paymentService.getPaymentByUserId(userId);
    }
}
