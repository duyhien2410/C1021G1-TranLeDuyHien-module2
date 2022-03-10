package case_study.services.impl;

import case_study.models.Booking;

public class House extends Booking {
    private String roomStandard;
    private int numberFloors;

    public House() {
    }

    public House(String serviceName, String useArea, int cost, int amountMax, int rentType, String roomStandard, int numberFloors) {
        super(serviceName, useArea, cost, amountMax, rentType);
        this.roomStandard = roomStandard;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
