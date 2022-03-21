package case_study.models;

public class House extends Facility {
    private String roomStandard;
    private String numberFloors;

    public House() {
    }

    public House(String serviceCode, String serviceName, String useArea, String cost, String maximumQuantity, String rentType, String roomStandard, String numberFloors) {
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

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
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

    public  String getInfoHouseToCSV(){
        return this.getServiceCode()+","+this.getServiceName()+","+this.getUseArea()+","+this.getCost()+"," +
                ""+this.getMaximumQuantity()+","+this.getRentType()+","+this.getRoomStandard()+","+this.getNumberFloors();
    }
}
