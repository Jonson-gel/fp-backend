package com.gel.web.eneloop.pojo;

public class Order {
    private int orderId;
    private int userId;
    private int powerBankId;
    private int startTime;
    private int endTime;
    private int fee;
    private int orderState;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPowerBankId() {
        return powerBankId;
    }

    public void setPowerBankId(int powerBankId) {
        this.powerBankId = powerBankId;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", powerBankId=" + powerBankId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", fee=" + fee +
                ", orderState=" + orderState +
                '}';
    }
}
