package com.gel.web.eneloop.pojo;

public class Site {
    private int siteId;
    private int capacity;
    private int availableReserves;
    private int currentReserves;
    private String location;
    private int serviceAreaId;
    private String dockingUnitList;
    private int siteState;
    private int longitude;
    private int latitude;

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAvailableReserves() {
        return availableReserves;
    }

    public void setAvailableReserves(int availableReserves) {
        this.availableReserves = availableReserves;
    }

    public int getCurrentReserves() {
        return currentReserves;
    }

    public void setCurrentReserves(int currentReserves) {
        this.currentReserves = currentReserves;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getServiceAreaId() {
        return serviceAreaId;
    }

    public void setServiceAreaId(int serviceAreaId) {
        this.serviceAreaId = serviceAreaId;
    }

    public String getDockingUnitList() {
        return dockingUnitList;
    }

    public void setDockingUnitList(String dockingUnitList) {
        this.dockingUnitList = dockingUnitList;
    }

    public int getSiteState() {
        return siteState;
    }

    public void setSiteState(int siteState) {
        this.siteState = siteState;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Site{" +
                "siteId=" + siteId +
                ", capacity=" + capacity +
                ", availableReserves=" + availableReserves +
                ", currentReserves=" + currentReserves +
                ", location='" + location + '\'' +
                ", serviceAreaId=" + serviceAreaId +
                ", dockingUnitList='" + dockingUnitList + '\'' +
                ", siteState=" + siteState +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
