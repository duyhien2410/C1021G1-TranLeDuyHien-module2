package case_study.utils;

import case_study.models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    public static void write(List<Customer> customerList, boolean append) {
        File file = new File("src/case_study/datas/customer.csv");

        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer c : customerList) {
                bufferedWriter.write(c.getInfoCustomToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> read() {
        List<Customer> customerList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/case_study/datas/customer.csv");
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            String arr[];
            Customer customer;
            while ((line = bufferedReader.readLine())!= null){
                arr = line.split(",");
                customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8]);
                customerList.add(customer);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
