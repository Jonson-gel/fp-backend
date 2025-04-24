package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.Order;
import com.gel.web.eneloop.pojo.Payment;

import java.util.List;

public interface PaymentService {
    public void createPayment(int userId, Order order, int paymentState);

    public void createTrans(int userId, int amount, int paymentState);

    public List<Payment> getPaymentByUserId(int userId);
}
