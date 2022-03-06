package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.impl;

import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.model.Vehicle;
import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Motorcycle extends Vehicle implements Vehicles {
    Scanner sc = new Scanner(System.in);
    private List<Motorcycle> motorArray = new ArrayList<>();
    private String wattage;    //công suất

    public Motorcycle() {
    }

    public Motorcycle(String wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String licensePlate, String manufacturer, String yearProduction, String owner, String wattage) {
        super(licensePlate, manufacturer, yearProduction, owner);
        this.wattage = wattage;
    }

    public List<Motorcycle> getMotorArray() {
        return motorArray;
    }

    public void setMotorArray(List<Motorcycle> motorArray) {
        this.motorArray = motorArray;
    }

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Motorcycle{" +
                "motorArray=" + motorArray +
                ", wattage=" + wattage +
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
        System.out.print("Nhập trọng tải xe:");
        String tonnage = sc.nextLine();

        Motorcycle motor = new Motorcycle(licensePlate,manufacturer,yearProduction,owner,tonnage);
        this.motorArray.add(motor);
    }

    @Override
    public void deleteVehicle() {
        System.out.println("Nhập vào biển số xe cần xoá:");
        String removeVehico = sc.nextLine();
        boolean check = false;
        for (int i = 0; i<motorArray.size(); i++){
            if (motorArray.get(i).getLicensePlate().equals(removeVehico)){
                check = true;
                this.motorArray.remove(i);
                break;
            }
            System.out.println("Không tìm thấy xe cần xoá");
        }
    }

    @Override
    public void displayVehicle() {
        for (Motorcycle motor : motorArray){
            System.out.println(motor);
        }
    }
}
