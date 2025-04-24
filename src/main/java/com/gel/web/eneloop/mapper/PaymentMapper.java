package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PaymentMapper {

    public void createPayment(Payment payment);

    public List<Payment> getPaymentByUserId(int userId);
}
