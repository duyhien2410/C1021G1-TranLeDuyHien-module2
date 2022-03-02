package oop_review.chuong_trinh_quan_ly_phuong_tien_giao_thong;

import java.util.Scanner;

public class Run {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("\nCHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiển thị phương tiện.\n" +
                    "3. Xoá phương tiện.\n" +
                    "4. Thoát.\n");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Chọn phương tiện cần thêm:\n" +
                            "1. Thêm ô tô.\n" +
                            "2. Thêm xe tải.\n" +
                            "3. Thêm xe máy.\n");
                    int choose1 = sc.nextInt();
                    switch (choose1){
                        case 1:
                            VehicleManage car = new Car();
                            addVehico(car);

                            System.out.println("Nhập số ghế ngồi:");
                            int numberOfSeats = sc.nextInt();sc.nextLine();
                            System.out.println("Nhập kiểu xe");
                            String vehicoType = sc.nextLine();

                            car = new Car(car.getLicensePlate(), car.getManufacturer(),car.getOwner(),numberOfSeats,vehicoType);
                            System.out.println(car);
                            break;
                        case 2:
                    }

            }
        } while (flag);

    }

    static void addVehico(VehicleManage vehico){
        sc.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        String licensePalate = sc.nextLine();
        System.out.println("Nhập tên chủ sở hữu:");
        String owner = sc.nextLine();
        System.out.println("Nhập biển số xe:");
        String manufacturer = sc.nextLine();
    }

}
