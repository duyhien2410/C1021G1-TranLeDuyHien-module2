package case_study.services.impl;

import case_study.models.Customer;
import case_study.models.Employee;
import case_study.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    static {
        customerList.add(new Customer("1","Quan Vân Trường","29/11/2000","Gay","201132475","0532475698","changtraitre2000@gmail.com","Diamond","Novotel, Sky36"));
        customerList.add(new Customer("2","Quan Nhị Ca","29/11/2000","Gay","201132475","0532475698","changtraitre2000@gmail.com","Diamond","Novotel, Sky36"));
        customerList.add(new Customer("3","Quan Vũ","29/11/2000","Gay","201132475","0532475698","changtraitre2000@gmail.com","Diamond","Novotel, Sky36"));
    }

    @Override
    public void addService() {
        System.out.print("Enter customer's code:");
        String customerCode = sc.nextLine();
        System.out.print("Enter customer's name:");
        String customerName = sc.nextLine();
        System.out.print("Enter customer's birth day:");
        String customerBirthDay = sc.nextLine();
        System.out.print("Enter customer's sex:");
        String customerSex = sc.nextLine();
        System.out.print("Enter customer's identity card:");
        String customerIdentityCard = sc.nextLine();
        System.out.print("Enter customer's phone number:");
        String customerPhone = sc.nextLine();
        System.out.print("Enter customer's email:");
        String customerEmail = sc.nextLine();
        System.out.print("Enter customer's type:");
        String customerType = sc.nextLine();
        System.out.println("Enter customer's address");
        String customerAddress = sc.nextLine();

        Customer customer = new Customer(customerCode,customerName,customerBirthDay,customerSex,customerIdentityCard,customerPhone,customerEmail,customerType,customerAddress);
        customerList.add(customer);

    }

    @Override
    public void editService() {
        displayService();
        System.out.print("Nhập mã nhân viên mà bạn muốn sửa:");
        String customerCodeEdit = sc.nextLine();

        for(int i = 0 ; i<customerList.size(); i++){
            if (customerCodeEdit.equals(customerList.get(i).getCode())){
                System.out.print("Enter again customer's code:");
                String customerCode = sc.nextLine();
                System.out.print("Enter again customer's name:");
                String customerName = sc.nextLine();
                System.out.print("Enter again customer's birth day:");
                String customerBirthDay = sc.nextLine();
                System.out.print("Enter again customer's sex:");
                String customerSex = sc.nextLine();
                System.out.print("Enter again customer's identity card:");
                String customerIdentityCard = sc.nextLine();
                System.out.print("Enter again customer's phone number:");
                String customerPhone = sc.nextLine();
                System.out.print("Enter again customer's email:");
                String customerEmail = sc.nextLine();
                System.out.print("Enter again customer's type:");
                String customerType = sc.nextLine();
                System.out.println("Enter again customer's address");
                String customerAddress = sc.nextLine();
                customerList.get(i).setName(customerName);
                customerList.get(i).setBirthDay(customerBirthDay);
                customerList.get(i).setSex(customerSex);
                customerList.get(i).setIdentityCard(customerIdentityCard);
                customerList.get(i).setPhoneNumber(customerPhone);
                customerList.get(i).setEmail(customerEmail);
                customerList.get(i).setCustomerType(customerType);
                customerList.get(i).setAddress(customerAddress);
            }
        }
    }

    @Override
    public void displayService() {
        System.out.println("-----List of customer-----");
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}
