package case_study.models;

public class House extends Facility {
    private String roomStandard;
    private int numberFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, String useArea, int cost, int maximumQuantity, String rentType, String roomStandard, int numberFloors) {
        super(serviceCode, serviceName, useArea, cost, maximumQuantity, rentType);
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
        return "House{" +
                super.toString() +
                ", roomStandard='" + roomStandard + '\'' +
                ", numberFloors=" + numberFloors +
                '}';
    }
}
