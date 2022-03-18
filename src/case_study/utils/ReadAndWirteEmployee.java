package case_study.utils;

import case_study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWirteEmployee {
    public static void write(List<Employee> employeeList, boolean append) {
        File file = new File("src/case_study/datas/employee.csv");

        try {
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee e : employeeList) {
                bufferedWriter.write(e.getInfoEmployToCSV());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> read() {
        List<Employee> employeeList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/case_study/datas/employee.csv");
            BufferedReader bufferedReader = new BufferedReader((fileReader));
            String line;
            String temp[];
            Employee employee;
            while ((line = bufferedReader.readLine())!= null){
                temp = line.split(",");
                employee = new Employee(temp[0], temp[1], temp[2], temp[3], temp[4], temp[5], temp[6], temp[7], temp[8],temp[9]);
                employeeList.add(employee);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
}
