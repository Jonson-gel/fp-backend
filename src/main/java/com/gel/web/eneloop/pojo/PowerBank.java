package com.gel.web.eneloop.pojo;

public class PowerBank {

    private int powerBankId;

    private int batteryState;

    private int powerBankState;

    private int usageTime;

    private int siteId;

    public int getPowerBankId() {
        return powerBankId;
    }

    public void setPowerBankId(int powerBankId) {
        this.powerBankId = powerBankId;
    }

    public int getBatteryState() {
        return batteryState;
    }

    public void setBatteryState(int batteryState) {
        this.batteryState = batteryState;
    }

    public int getPowerBankState() {
        return powerBankState;
    }

    public void setPowerBankState(int powerBankState) {
        this.powerBankState = powerBankState;
    }

    public int getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(int usage_time) {
        this.usageTime = usage_time;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Override
    public String toString() {
        return "PowerBank{" +
                "powerBankId=" + powerBankId +
                ", batteryState=" + batteryState +
                ", powerBankState=" + powerBankState +
                ", usageTime=" + usageTime +
                ", siteId=" + siteId +
                '}';
    }
}
