package case_study.services.impl;

import case_study.models.Booking;

public class Room extends Booking {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceName, String useArea, int cost, int amountMax, int rentType, String serviceFree) {
        super(serviceName, useArea, cost, amountMax, rentType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }
}
