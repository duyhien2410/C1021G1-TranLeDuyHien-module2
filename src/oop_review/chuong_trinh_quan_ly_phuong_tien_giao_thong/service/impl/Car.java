package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.impl;

import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.model.Vehicle;
import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehicle implements Vehicles {
    Scanner sc = new Scanner(System.in);
    private List<Car> carArray = new ArrayList<Car>();
    private int numberOfSeats;      //số ghế ngồi
    private String vehicoType;      //kiểu xe (du lịch, xe khách)

    public Car() {
    }

    public Car(String licensePlate, String manufacturer, String yearProduction, String owner, int numberOfSeats, String vehicoType) {
        super(licensePlate, manufacturer, yearProduction, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicoType = vehicoType;
    }

    public List<Car> getCarArray() {
        return carArray;
    }

    public void setCarArray(List<Car> carArray) {
        this.carArray = carArray;
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
                " Car{" +
                ", numberOfSeats=" + numberOfSeats +
                ", vehicoType='" + vehicoType + '\'' +
                '}';
    }

    @Override
    public void addVehicle() {
        System.out.print("Nhập hãng sản xuất:");
        String manufacturer = sc.nextLine();
        System.out.print("Nhập tên chủ sở hữu:");
        String owner = sc.nextLine();
        System.out.print("Nhập năm sản xuất:");
        String yearProduction = sc.nextLine();
        System.out.print("Nhập biển số xe:");
        String licensePlate = sc.nextLine();
        System.out.print("Nhập số ghế ngồi: ");
        int numberOfSeats = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String vehicoType = sc.nextLine();

        Car car = new Car(licensePlate,manufacturer,yearProduction,owner,numberOfSeats,vehicoType);
        this.carArray.add(car);
    }


    @Override
    public void deleteVehicle() {
        System.out.println("Nhập vào biển số xe cần xoá:");
        String removeVehico = sc.nextLine();
        boolean check = false;
        for (int i = 0; i<carArray.size(); i++){
            if (carArray.get(i).getLicensePlate().equals(removeVehico)){
                check = true;
                this.carArray.remove(i);
                break;
            }
            System.out.println("Không tìm thấy xe cần xoá");
        }
    }

    @Override
    public void displayVehicle() {
        for (Car car : carArray) {
            System.out.println(car);
        }
    }
}
