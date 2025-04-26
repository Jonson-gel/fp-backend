package com.gel.web.eneloop.service;

import com.gel.web.eneloop.mapper.NotificationMapper;
import com.gel.web.eneloop.pojo.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationImpl implements NotificationService{

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public void createNotification(Notification notification){
        notificationMapper.createNotification(notification);
    }

    @Override
    public List<Notification> getNotificationByUserId(int userId){
        return notificationMapper.getNotificationByUserId(userId);
    }

    @Override
    public Notification getNotificationById(int notificationId){
        return notificationMapper.getNotificationById(notificationId);
    }
}
