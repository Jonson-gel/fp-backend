package com.gel.web.eneloop.controller;

import com.gel.web.eneloop.pojo.Notification;
import com.gel.web.eneloop.pojo.Order;
import com.gel.web.eneloop.service.NotificationService;
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
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private OrderController orderController;

    @Autowired
    private UserController userController;

    @Autowired
    private PaymentController paymentController;

    @PostMapping("/notification/device_failure/{orderId}/{userId}")
    @ResponseBody
    public void deviceFailureAddress(@PathVariable("orderId") int orderId, @PathVariable("userId") int userId) {
        Order order = orderController.getOrderById(orderId);

        Notification notification = new Notification();
        notification.setUserId(userId);

        int timestamp = (int) (System.currentTimeMillis() / 1000);
        notification.setSentTime(timestamp);

        String content = "Your 'Device Failure' issue about order: " + orderId + " has been addressed, and the refund has been processed. We sincerely apologize for the experience you have encountered.";
        notification.setContent(content);
        notification.setNotificationState(1);

        notificationService.createNotification(notification);

        int fee = order.getFee();
        int balance = userController.getUserById(userId).getBalance();
        int newBalance = balance + fee;

        userController.updateBalance(userId, newBalance);

        paymentController.refundPayment(userId, fee);
    }

    @PostMapping("/notification/loss/{orderId}/{userId}")
    @ResponseBody
    public void lossAddress(@PathVariable("orderId") int orderId, @PathVariable("userId") int userId) {
        Order order = orderController.getOrderById(orderId);

        Notification notification = new Notification();
        notification.setUserId(userId);

        int timestamp = (int) (System.currentTimeMillis() / 1000);
        notification.setSentTime(timestamp);

        String content = "Your 'Power Bank Lost' issue about order: " + orderId + " has been addressed, and your deposit has been deducted.";
        notification.setContent(content);
        notification.setNotificationState(2);

        notificationService.createNotification(notification);

        int balance = userController.getUserById(userId).getBalance();
        int newBalance = balance - 20;

        userController.updateBalance(userId, newBalance);

        paymentController.penaltyPayment(userId, 20);
    }

    @GetMapping("/notification/{userId}")
    @ResponseBody
    public List<Notification> getNotificationByUserId(@PathVariable("userId") int userId){
        return notificationService.getNotificationByUserId(userId);
    }

    @GetMapping("/notification/single/{notificationId}")
    @ResponseBody
    public Notification getNotificationById(@PathVariable("notificationId") int notificationId){
        return notificationService.getNotificationById(notificationId);
    }
}
