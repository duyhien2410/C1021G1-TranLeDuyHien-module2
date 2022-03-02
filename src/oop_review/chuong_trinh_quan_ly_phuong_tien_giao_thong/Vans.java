package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong;

public class Vans extends VehicleManage {
    private int tonnage;

    public Vans() {
    }

    public Vans(int tonnage) {
        this.tonnage = tonnage;
    }

    public Vans(String licensePlate, String manufacturer, String owner, int tonnage) {
        super(licensePlate, manufacturer, owner);
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nVans{" +
                "tonnage=" + tonnage +
                '}';
    }
}
