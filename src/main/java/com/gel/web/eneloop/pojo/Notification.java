package com.gel.web.eneloop.pojo;

public class Notification {
    private int notificationId;
    private int userId;
    private String content;
    private int sentTime;

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSentTime() {
        return sentTime;
    }

    public void setSentTime(int sentTime) {
        this.sentTime = sentTime;
    }
}

