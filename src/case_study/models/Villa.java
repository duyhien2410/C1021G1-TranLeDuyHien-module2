package case_study.models;

public class Villa extends Facility {
    private String roomStandard;
    private String poolArea;
    private String numberFloors;

    public Villa() {
    }

    public Villa(String serviceCode, String serviceName, String useArea,
                 String cost, String maximumQuantity, String rentType, String roomStandard,
                 String poolArea, String numberFloors) {
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

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
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

    public  String getInfoVillaToCSV(){
        return this.getServiceCode()+","+this.getServiceName()+","+this.getUseArea()+","+this.getCost()+"," +
                ""+this.getMaximumQuantity()+","+this.getRentType()+","+this.getRoomStandard()+","+
                this.getPoolArea()+","+this.getNumberFloors();
    }
}
