package oop_review.nhap_xuat_thong_tin_xe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Vehicle> arrayVehicle = new ArrayList<>();
        Vehicle vehicle = new Vehicle();
        boolean flag = true;
        do {
            System.out.println("Menu:" +
                    "\n1.Nhập thông tin xe." +
                    "\n2.Hiển thị tiền thuế của các xe." +
                    "\n3.Thoát");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập hãng sản xuất:");
                    String manufacturer = sc.nextLine();

                    System.out.println("Nhập dung tích xy lanh của xe:");
                    double cubicCentimeters = Double.parseDouble(sc.nextLine());

                    System.out.println("Nhập giá tiền của xe:");
                    double vehicleValue = Double.parseDouble(sc.nextLine());

                    Vehicle vehicles = new Vehicle(manufacturer, cubicCentimeters, vehicleValue);
                    arrayVehicle.add(vehicles);
                    break;
                case 2:
                    for (Vehicle vehicle1 : arrayVehicle) {
                        System.out.println(vehicle1);
                        vehicle1.tax();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    flag = false;
                    System.out.println("Error");
            }
        } while (flag);
    }
}
