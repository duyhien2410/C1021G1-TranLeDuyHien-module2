package oop_review.nhap_xuat_thong_tin_xe;

public class Dream extends Vehicle{
    public Dream() {
    }

    public Dream(int cubicCentimeters, int vehicleValue) {
        super(cubicCentimeters, vehicleValue);
    }

    @Override
    public String toString() {
        return "Dream:\n " +
                super.toString();
    }
}
