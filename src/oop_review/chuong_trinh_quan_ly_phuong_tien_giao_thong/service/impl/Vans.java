package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.impl;

import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.model.Vehicle;
import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vans extends Vehicle implements Vehicles {
    Scanner sc = new Scanner(System.in);
    List<Vans> vansArray = new ArrayList<>();
    private String tonnage;

    public Vans() {
    }

    public Vans(String tonnage) {
        this.tonnage = tonnage;
    }

    public Vans(String licensePlate, String manufacturer, String yearProduction, String owner, String tonnage) {
        super(licensePlate, manufacturer, yearProduction, owner);
        this.tonnage = tonnage;
    }

    public List<Vans> getArrayVans() {
        return vansArray;
    }

    public void setArrayVans(List<Vans> arrayVans) {
        this.vansArray = arrayVans;
    }

    public String getTonnage() {
        return tonnage;
    }

    public void setTonnage(String tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Vans{" +
                ", arrayVans=" + vansArray +
                ", tonnage=" + tonnage +
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

        Vans vans = new Vans(licensePlate,manufacturer,yearProduction,owner,tonnage);
        this.vansArray.add(vans);
    }

    @Override
    public void deleteVehicle() {
        System.out.println("Nhập vào biển số xe cần xoá:");
        String removeVehico = sc.nextLine();
        boolean check = false;
        for (int i = 0; i<vansArray.size(); i++){
            if (vansArray.get(i).getLicensePlate().equals(removeVehico)){
                check = true;
                this.vansArray.remove(i);
                break;
            }
            System.out.println("Không tìm thấy xe cần xoá");
        }
    }

    @Override
    public void displayVehicle() {
        for (Vans vans : vansArray){
            System.out.println(vans);
        }
    }
}
