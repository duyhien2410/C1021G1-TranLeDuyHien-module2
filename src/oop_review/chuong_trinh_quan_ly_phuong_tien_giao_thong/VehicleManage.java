package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong;

public abstract class VehicleManage {
    private String licensePlate;    //biển số xe
    private String manufacturer;    //hãng sản xuất
    private String owner;           //chủ sở hữu
    Object[] vehicles;

    public VehicleManage() {
    }

    public VehicleManage(String licensePlate, String manufacturer, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "VehicleManage{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
