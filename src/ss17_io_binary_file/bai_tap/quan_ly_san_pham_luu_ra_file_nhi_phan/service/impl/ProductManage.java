package ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.impl;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Product;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.service.Products;
import ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.util.WriteAndReadFileProduct;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManage extends Product implements Products {
    List<Product> productList = new ArrayList<>();
    public static final String OUT_PUT = "src/ss17_io_binary_file/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/data/Output.txt";
    Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Nhập mã hàng:");
        String productCode = sc.nextLine();
        System.out.print("Nhập tên sản phẩm:");
        String productName = sc.nextLine();
        System.out.print("Nhập hãng sản xuất:");
        String manufacturer = sc.nextLine();
        System.out.print("Nhập giá sản phẩm:");
        String productPrice = sc.nextLine();

        Product product = new Product(productCode,productName,manufacturer,productPrice);
        productList = WriteAndReadFileProduct.readProduct();
        productList.add(product);
        WriteAndReadFileProduct.writeProduct(productList);
    }

    @Override
    public void displayProduct() {
        productList = WriteAndReadFileProduct.readProduct();
        for (int i = 0 ; i < productList.size();i++){
            System.out.println(productList.get(i).toString());
        }
    }
}
