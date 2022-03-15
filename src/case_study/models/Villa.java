package case_study.models;

import case_study.models.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private int poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String serviceName, String useArea, int cost, int amountMax, int rentType, String roomStandard, int poolArea, int numberFloors) {
        super(serviceName, useArea, cost, amountMax, rentType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
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
                "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
