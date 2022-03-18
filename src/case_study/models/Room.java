package case_study.models;

public class Room extends Facility {
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceCode, String serviceName, String useArea, String cost, String maximumQuantity, String rentType, String serviceFree) {
        super(serviceCode, serviceName, useArea, cost, maximumQuantity, rentType);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                ", serviceFree='" + serviceFree + '\'' +
                '}';
    }

    public  String getInfoRoomToCSV(){
        return this.getServiceCode()+","+this.getServiceName()+","+this.getUseArea()+","+this.getCost()+"," +
                ""+this.getMaximumQuantity()+","+this.getRentType()+","+this.getServiceFree();
    }
}
