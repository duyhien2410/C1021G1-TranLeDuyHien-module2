package oop_review.nhap_xuat_thong_tin_xe;

public class Vehicle {
    private double cubicCentimeters;
    private double vehicleValue;

    public Vehicle() {
    }

    public Vehicle(double cubicCentimeters, double vehicleValue) {
        this.cubicCentimeters = cubicCentimeters;
        this.vehicleValue = vehicleValue;
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

    public double getTax(){
        double taxMotorBike;
        if (getCubicCentimeters()<=100){
             taxMotorBike=getVehicleValue()*0.01;
        } else if (getCubicCentimeters()<=200){
                taxMotorBike=getVehicleValue()*6/100;
        } else {
            taxMotorBike=getVehicleValue()*3/100;
        }
        return taxMotorBike;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "Dung tích xi lanh=" + cubicCentimeters +
                ", Giá trị xe=" + vehicleValue +
                ", Thuế xe=" + getTax()+
                '}';
    }
}
