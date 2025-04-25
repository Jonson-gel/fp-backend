package com.gel.web.eneloop.mapper;

import com.gel.web.eneloop.pojo.Notification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NotificationMapper {

    public void createNotification(Notification notification);

    public List<Notification> getNotificationByUserId(int userId);
}
