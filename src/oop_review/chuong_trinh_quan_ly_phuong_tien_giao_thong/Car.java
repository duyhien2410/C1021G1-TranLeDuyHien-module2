package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong;

public class Car extends VehicleManage {
    private int numberOfSeats;      //số ghế ngồi
    private String vehicoType;      //kiểu xe (du lịch, xe khách)

    public Car() {
    }

    public Car(int numberOfSeats, String vehicoType) {
        this.numberOfSeats = numberOfSeats;
        this.vehicoType = vehicoType;
    }

    public Car(String licensePlate, String manufacturer, String owner, int numberOfSeats, String vehicoType) {
        super(licensePlate, manufacturer, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicoType = vehicoType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicoType() {
        return vehicoType;
    }

    public void setVehicoType(String vehicoType) {
        this.vehicoType = vehicoType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCar{" +
                "numberOfSeats=" + numberOfSeats +
                ", vehicoType='" + vehicoType + '\'' +
                '}';
    }
}
