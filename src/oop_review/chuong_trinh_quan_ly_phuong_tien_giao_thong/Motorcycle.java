package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong;

public class Motorcycle extends VehicleManage {
    private int wattage;    //công suất

    public Motorcycle() {
    }

    public Motorcycle(int wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String licensePlate, String manufacturer, String owner, int wattage) {
        super(licensePlate, manufacturer, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wattage=" + wattage +
                '}';
    }
}
