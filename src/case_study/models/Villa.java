package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private int poolArea;
    private int numberFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, String useArea, int cost, int maximumQuantity, String rentType, String roomStandard, int poolArea, int numberFloors) {
        super(serviceCode, serviceName, useArea, cost, maximumQuantity, rentType);
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
        return "Villa{" +
                super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
