package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.controller;

import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.impl.Car;
import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.impl.Motorcycle;
import oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong.service.impl.Vans;

import java.util.Scanner;

public class MainVehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        Vans vans = new Vans();
        Motorcycle motorcycle = new Motorcycle();
        boolean flag = true;

        do {
            System.out.print("\nCHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG." +
                    "\n1.Thêm mới phương tiện." +
                    "\n2.Hiển thị phương tiện." +
                    "\n3.Xoá phương tiện." +
                    "\n4.Thoát." +
                    "\nChọn chức năng:" );
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("\nChọn phương tiện để thêm mới:" +
                            "\n1.Thêm xe tải." +
                            "\n2.Thêm ô tô." +
                            "\n3.Thêm xe máy.");
                    int choose1 = sc.nextInt();
                    switch (choose1){
                        case 1:
                            vans.addVehicle();;
                            break;
                        case 2:
                            car.addVehicle();
                            break;
                        case 3:
                            motorcycle.addVehicle();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("\nChọn phương tiện cần hiển thị:" +
                            "\n1.Hiển thị xe tải." +
                            "\n2.Hiển thị ô tô." +
                            "\n3.Hiển thị xe máy.");
                    int choose2 = sc.nextInt();
                    switch (choose2){
                        case 1:
                            System.out.println("Xe tải:");
                            vans.displayVehicle();
                            break;
                        case 2:
                            System.out.println("Ô tô:");
                            car.displayVehicle();
                            break;
                        case 3:
                            System.out.println("Xe máy:");
                            motorcycle.displayVehicle();
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nChọn phương tiện cần xoá:" +
                            "\n1.Hiển thị xe tải." +
                            "\n2.Hiển thị ô tô." +
                            "\n3.Hiển thị xe máy.");
                    int choose3 = sc.nextInt();
                    switch (choose3){
                        case 1:
                            System.out.println("Xe tải:");
                            vans.deleteVehicle();
                            break;
                        case 2:
                            System.out.println("Ô tô:");
                            car.deleteVehicle();
                            break;
                        case 3:
                            System.out.println("Xe máy:");
                            motorcycle.deleteVehicle();
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (flag);
    }
}
