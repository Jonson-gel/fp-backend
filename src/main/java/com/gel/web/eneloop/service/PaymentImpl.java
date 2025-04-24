package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.PaymentMapper;
import com.gel.web.eneloop.pojo.Order;
import com.gel.web.eneloop.pojo.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentImpl implements PaymentService{
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public void createPayment(int userId, Order order, int paymentState){
        Payment payment = new Payment();
        payment.setUserId(userId);
        payment.setOrderId(order.getOrderId());
        payment.setFee(order.getFee());
        payment.setPaymentState(paymentState);

        int timestamp = (int) (System.currentTimeMillis() / 1000);
        payment.setPaymentTime(timestamp);
        paymentMapper.createPayment(payment);
    }

    @Override
    public void createTrans(int userId, int amount, int paymentState){
        Payment payment = new Payment();
        payment.setUserId(userId);
        payment.setOrderId(1);
        payment.setFee(amount);
        payment.setPaymentState(paymentState);

        int timestamp = (int) (System.currentTimeMillis() / 1000);
        payment.setPaymentTime(timestamp);
        paymentMapper.createPayment(payment);
    }

    @Override
    public List<Payment> getPaymentByUserId(int userId){
        return paymentMapper.getPaymentByUserId(userId);
    }
}
