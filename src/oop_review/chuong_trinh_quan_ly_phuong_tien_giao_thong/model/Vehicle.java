package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.model;

public class Vehicle {
    private String licensePlate;    //biển số xe
    private String manufacturer;    //hãng sản xuất
    private String yearProduction;  //năm sản xuất
    private String owner;           //chủ sở hữu

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String manufacturer, String yearProduction, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.yearProduction = yearProduction;
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

    public String getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(String yearProduction) {
        this.yearProduction = yearProduction;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", yearProduction='" + yearProduction + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
