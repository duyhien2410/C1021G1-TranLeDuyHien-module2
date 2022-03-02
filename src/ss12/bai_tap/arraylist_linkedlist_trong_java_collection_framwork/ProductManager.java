package ss12.bai_tap.arraylist_linkedlist_trong_java_collection_framwork;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductManager implements Products{
    ArrayList<Product> productArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void addProduct() {
        System.out.print("Nhập vào số thứ tự sản phẩm:");
        String id = String.valueOf(sc.nextLine());
        System.out.print("Nhập vào tên sản phẩm:");
        String nameProduct = String.valueOf(sc.nextLine());
        System.out.print("Nhập vào giá trị sản phẩm:");
        int valueProduct = Integer.parseInt(sc.nextLine());


        Product product = new Product(id,nameProduct,valueProduct);
        productArrayList.add(product);
    }

    @Override
    public void removeProduct() {
        System.out.print("Nhập vào số thứ tự của sản phẩm muốn xoá:");
        String idRemove = String.valueOf(sc.nextLine());
        for(int i = 0 ; i < productArrayList.size() ; i++){
            if (idRemove.equals(productArrayList.get(i).getId())){
                productArrayList.remove(i);
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product: productArrayList){
            System.out.println(product);
        }
    }

    @Override
    public void sortProduct() {
        productArrayList.sort(Product::compareTo);
        System.out.println(productArrayList);
    }
}
