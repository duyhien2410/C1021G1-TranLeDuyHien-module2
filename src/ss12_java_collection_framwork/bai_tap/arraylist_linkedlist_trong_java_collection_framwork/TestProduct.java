package ss12_java_collection_framwork.bai_tap.arraylist_linkedlist_trong_java_collection_framwork;

import java.util.Scanner;

public class TestProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean flag = true;
       do {
           System.out.println("\nQUẢN LÝ SẢN PHẨM:" +
                   "\n1.Thêm sản phẩm." +
                   "\n2.Xoá sản phẩm." +
                   "\n3.Hiển thị danh sách sản phẩm." +
                   "\n4.Sắp xếp sản phẩm tăng dần." +
                   "\n5.Thoát.");
           int choose = sc.nextInt();
           switch (choose){
               case 1:
                   productManager.addProduct();
                   break;
               case 2:
                   productManager.removeProduct();
                   break;
               case 3:
                   productManager.displayProduct();
                   break;
               case 4:
                   productManager.sortProduct();
                   break;
               case 5:
                   System.exit(0);
                   break;
           }
       } while (flag);
    }
}
