package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void addService() {
        System.out.print("Nhập mã nhân viên:");
        String employeeCode = sc.nextLine();
        System.out.print("Nhập tên nhân viên:");
        String employeeName = sc.nextLine();
        System.out.print("Nhập ngày,tháng, năm sinh nhân viên:");
        String employeeBirthDay = sc.nextLine();
        System.out.print("Nhập giới tính nhân viên:");
        String employeeSex = sc.nextLine();
        System.out.print("Nhập căn cước nhân viên:");
        String employeeIdentityCard = sc.nextLine();
        System.out.print("Nhập số điện thoại nhân viên:");
        String employeePhone = sc.nextLine();
        System.out.print("Nhập email nhân viên:");
        String employeeEmail = sc.nextLine();
        System.out.print("Nhập trình độ nhân viên:");
        String employeeStandard = sc.nextLine();
        System.out.print("Nhập vị trí nhân viên:");
        String employeePosition = sc.nextLine();
        System.out.print("Nhập lương nhân viên:");
        String employeeWage = sc.nextLine();

        Employee employee = new Employee(employeeCode,employeeName,employeeBirthDay,employeeSex,employeeIdentityCard,employeePhone,employeeEmail,employeeStandard,employeePosition,employeeWage);
        employeeList.add(employee);
    }

    @Override
    public void editService() {
        System.out.println("Nhập mã nhân viên cần sửa:");
        String employeeEdit = sc.nextLine();
        for (int i=0; i<employeeList.size(); i++){
            if (employeeEdit.equals(employeeList.get(i).getCode())){

            }
        }
    }

    @Override
    public void displayService() {
        for (Employee employee: employeeList) {
            System.out.println(employee);
        }
    }
}
