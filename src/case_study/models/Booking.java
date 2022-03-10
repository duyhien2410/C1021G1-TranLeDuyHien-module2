package case_study.models;

public class Booking {
    private String serviceName; //tên dịch vụ
    private String useArea;     //diện tích sử dụng
    private int cost;           //chi phí thuê
    private int amountMax;      //số lượng người tối đa
    private int rentType;       //kiểu thuê

    public Booking() {
    }

    public Booking(String serviceName, String useArea, int cost, int amountMax, int rentType) {
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.cost = cost;
        this.amountMax = amountMax;
        this.rentType = rentType;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getUseArea() {
        return useArea;
    }

    public void setUseArea(String useArea) {
        this.useArea = useArea;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmountMax() {
        return amountMax;
    }

    public void setAmountMax(int amountMax) {
        this.amountMax = amountMax;
    }

    public int getRentType() {
        return rentType;
    }

    public void setRentType(int rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "serviceName='" + serviceName + '\'' +
                ", useArea='" + useArea + '\'' +
                ", cost=" + cost +
                ", amountMax=" + amountMax +
                ", rentType=" + rentType +
                '}';
    }
}
