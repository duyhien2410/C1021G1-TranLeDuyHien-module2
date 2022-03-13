package ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.controller;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.impl.ProductManage;

import java.io.IOException;
import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        do {
            ProductManage product = new ProductManage();
            System.out.print("\nQUẢN LÝ SẢN PHẨM" +
                    "\n1.Thêm sản phẩm." +
                    "\n2.Hiển thị sản phẩm." +
                    "\n3.Thoát");
            System.out.print("\nNhập vào lựa chọn của bạn:");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.displayProduct();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while(flag);
    }
}
