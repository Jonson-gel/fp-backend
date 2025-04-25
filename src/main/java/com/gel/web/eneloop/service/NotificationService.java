package com.gel.web.eneloop.service;

import com.gel.web.eneloop.pojo.Notification;

import java.util.List;

public interface NotificationService {

    public void createNotification(Notification notification);

    public List<Notification> getNotificationByUserId(int userId);
}
