package case_study.services.impl;

import case_study.models.Employee;
import case_study.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static {
        employeeList.add(new Employee("1","Nguyễn Xuân Hải","24/10/1998","Nam","201354865","0955412548","abc@gmail.com","xyz","bds","1000000"));
        employeeList.add(new Employee("2","Nguyễn Xuân Phúc","24/10/1998","Nam","201354865","0955412548","abc@gmail.com","xyz","bds","1000000"));
        employeeList.add(new Employee("3","Nguyễn Xuân Sang","24/10/1998","Nam","201354865","0955412548","abc@gmail.com","xyz","bds","1000000"));

    }
    @Override
    public void addService() {
        System.out.print("Enter employee's code:");
        String employeeCode = sc.nextLine();
        System.out.print("Enter employee's name:");
        String employeeName = sc.nextLine();
        System.out.print("Enter employee's birth day:");
        String employeeBirthDay = sc.nextLine();
        System.out.print("Enter employee's sex:");
        String employeeSex = sc.nextLine();
        System.out.print("Enter employee's identity card:");
        String employeeIdentityCard = sc.nextLine();
        System.out.print("Enter employee's phone number:");
        String employeePhone = sc.nextLine();
        System.out.print("Enter employee's email:");
        String employeeEmail = sc.nextLine();
        System.out.print("Enter employee's standard:");
        String employeeStandard = sc.nextLine();
        System.out.print("Enter employee's position:");
        String employeePosition = sc.nextLine();
        System.out.print("Enter employee's wage:");
        String employeeWage = sc.nextLine();

        Employee employee = new Employee(employeeCode, employeeName, employeeBirthDay, employeeSex, employeeIdentityCard, employeePhone, employeeEmail, employeeStandard, employeePosition, employeeWage);
        employeeList.add(employee);
    }

    @Override
    public void editService() {
        displayService();
        System.out.print("Input employee's code to edit:");
        String employeeCodeEdit = sc.nextLine();

        for(int i = 0 ; i<employeeList.size(); i++){
            if (employeeCodeEdit.equals(employeeList.get(i).getCode())){
                System.out.print("Enter again employee's name:");
                String employeeName = sc.nextLine();
                System.out.print("Enter again employee's birth day:");
                String employeeBirthDay = sc.nextLine();
                System.out.print("Enter again employee's sex:");
                String employeeSex = sc.nextLine();
                System.out.print("Enter again employee's identity card:");
                String employeeIdentityCard = sc.nextLine();
                System.out.print("Enter again employee's phone number:");
                String employeePhone = sc.nextLine();
                System.out.print("Enter again employee's email:");
                String employeeEmail = sc.nextLine();
                System.out.print("Enter again employee's standard:");
                String employeeStandard = sc.nextLine();
                System.out.print("Enter again employee's position:");
                String employeePosition = sc.nextLine();
                System.out.print("Enter again employee's wage:");
                String employeeWage = sc.nextLine();
                employeeList.get(i).setName(employeeName);
                employeeList.get(i).setBirthDay(employeeBirthDay);
                employeeList.get(i).setSex(employeeSex);
                employeeList.get(i).setIdentityCard(employeeIdentityCard);
                employeeList.get(i).setPhoneNumber(employeePhone);
                employeeList.get(i).setEmail(employeeEmail);
                employeeList.get(i).setStandard(employeeStandard);
                employeeList.get(i).setPosition(employeePosition);
                employeeList.get(i).setWage(employeeWage);
            }
        }
    }

    @Override
    public void displayService() {
        System.out.println("-----List of employee-----");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}
