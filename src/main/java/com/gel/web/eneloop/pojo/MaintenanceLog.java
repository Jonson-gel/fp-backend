package com.gel.web.eneloop.pojo;

public class MaintenanceLog {
    private int logId;
    private int createTime;
    private String issueDescription;
    private int orderId;
    private int maintenanceState;

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public int getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getMaintenanceState() {
        return maintenanceState;
    }

    public void setMaintenanceState(int maintenanceState) {
        this.maintenanceState = maintenanceState;
    }
}
