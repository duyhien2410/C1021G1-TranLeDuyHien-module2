package ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.util;

import ss17_io_binary_file.bai_tap.quan_ly_san_pham_luu_ra_file_nhi_phan.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadFileProduct {
    public static  void writeProduct (List<Product> products){
        File file = new File("src/ss17_io_binary_file/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/data/Output.txt");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Product> readProduct(){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fileInputStream = new FileInputStream("src/ss17_io_binary_file/bai_tap/quan_ly_san_pham_luu_ra_file_nhi_phan/data/Output.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            products = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
}
