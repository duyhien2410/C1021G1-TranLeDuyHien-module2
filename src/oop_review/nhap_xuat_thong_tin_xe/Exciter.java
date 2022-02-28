package oop_review.nhap_xuat_thong_tin_xe;

public class Exciter extends Vehicle{
    public Exciter() {
    }

    public Exciter(double cubicCentimeters, double vehicleValue) {
        super(cubicCentimeters, vehicleValue);
    }

    @Override
    public String toString() {
        return "Exciter:\n " +
                super.toString();
    }
}
