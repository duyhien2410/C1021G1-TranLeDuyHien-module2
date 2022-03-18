package case_study.models;

public abstract class Facility {
    private String serviceCode;
    private String serviceName; //tên dịch vụ
    private String useArea;     //diện tích sử dụng
    private String cost;           //chi phí thuê
    private String maximumQuantity;      //số lượng người tối đa
    private String rentType;

    public Facility() {
    }

    public Facility(String serviceCode, String serviceName, String useArea, String cost, String maximumQuantity, String rentType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.useArea = useArea;
        this.cost = cost;
        this.maximumQuantity = maximumQuantity;
        this.rentType = rentType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(String maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", useArea='" + useArea + '\'' +
                ", cost=" + cost +
                ", maximumQuantity=" + maximumQuantity +
                ", rentType='" + rentType + '\'';
    }
}
