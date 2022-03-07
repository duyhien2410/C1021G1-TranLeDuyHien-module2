package oop_review.nhap_xuat_thong_tin_xe;

public class Vehicle {
    private String manufacturer;
    private double cubicCentimeters;
    private double vehicleValue;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, double cubicCentimeters, double vehicleValue) {
        this.manufacturer = manufacturer;
        this.cubicCentimeters = cubicCentimeters;
        this.vehicleValue = vehicleValue;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getCubicCentimeters() {
        return cubicCentimeters;
    }

    public void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    public double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                " manufacturer='" + manufacturer + '\'' +
                ", cubicCentimeters=" + cubicCentimeters +
                ", vehicleValue=" + vehicleValue +
                '}';
    }

    public void tax() {
        double taxMotorBike;
        if (getCubicCentimeters() <= 100) {
            taxMotorBike = getVehicleValue() * 0.01;
        } else if (getCubicCentimeters() <= 200) {
            taxMotorBike = getVehicleValue() * 0.06;
        } else {
            taxMotorBike = getVehicleValue() * 0.03;
        }
        System.out.println("Thuế của xe " + this.getManufacturer() + ": " + taxMotorBike);
    }
}
