package oop_review.nhap_xuat_thong_tin_xe;

public class Sirius extends Vehicle{
    public Sirius() {
    }

    public Sirius(double cubicCentimeters, double vehicleValue) {
        super(cubicCentimeters, vehicleValue);
    }

    @Override
    public String toString() {
        return "Sirius:\n " +
                super.toString();
    }
}
