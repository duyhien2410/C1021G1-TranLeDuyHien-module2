package case_study.services.impl;

import case_study.models.Customer;
import case_study.services.CustomerService;
import case_study.utils.ReadAndWriteCustomer;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

//    static {
//        customerList.add(new Customer("1","Quan Vân Trường","29/11/2000","Gay","201132475","0532475698","changtraitre2000@gmail.com","Diamond","Novotel, Sky36"));
//        customerList.add(new Customer("2","Quan Nhị Ca","29/11/2000","Gay","201132475","0532475698","changtraitre2000@gmail.com","Diamond","Novotel, Sky36"));
//        customerList.add(new Customer("3","Quan Vũ","29/11/2000","Gay","201132475","0532475698","changtraitre2000@gmail.com","Diamond","Novotel, Sky36"));
//    }

    @Override
    public void addService() {
        System.out.print("Enter customer's code:");
        String customerCode = sc.nextLine();
        System.out.print("Enter customer's name:");
        String customerName = sc.nextLine();
        System.out.print("Enter customer's birth day:");
        String customerBirthDay = sc.nextLine();
        System.out.print("Enter customer's genders:");
        String customerGenders = sc.nextLine();
        System.out.print("Enter customer's identity card:");
        String customerIdentityCard = sc.nextLine();
        System.out.print("Enter customer's phone number:");
        String customerPhone = sc.nextLine();
        System.out.print("Enter customer's email:");
        String customerEmail = sc.nextLine();
        System.out.print("Enter customer's type:");
        String customerType = sc.nextLine();
        System.out.print("Enter customer's address:");
        String customerAddress = sc.nextLine();

        Customer customer = new Customer(customerCode,customerName,customerBirthDay,customerGenders,customerIdentityCard,customerPhone,customerEmail,customerType,customerAddress);
        customerList.add(customer);
        ReadAndWriteCustomer.write(customerList,true);
        System.out.println("Added.");
    }

    @Override
    public void editService() {
        displayService();
        List<Customer> customerList3 = ReadAndWriteCustomer.read();
        System.out.print("Enter service's code to edit:");
        String customerCodeEdit = sc.nextLine();

        for(int i = 0 ; i<customerList3.size(); i++){
            if (customerCodeEdit.equals(customerList3.get(i).getCode())){
//                System.out.print("Enter again customer's code:");
//                String customerCode = sc.nextLine();
                System.out.print("Enter again customer's name:");
                String customerName = sc.nextLine();
                System.out.print("Enter again customer's birth day:");
                String customerBirthDay = sc.nextLine();
                System.out.print("Enter again customer's genders:");
                String customerGenders = sc.nextLine();
                System.out.print("Enter again customer's identity card:");
                String customerIdentityCard = sc.nextLine();
                System.out.print("Enter again customer's phone number:");
                String customerPhone = sc.nextLine();
                System.out.print("Enter again customer's email:");
                String customerEmail = sc.nextLine();
                System.out.print("Enter again customer's type:");
                String customerType = sc.nextLine();
                System.out.print("Enter again customer's address:");
                String customerAddress = sc.nextLine();
                customerList3.get(i).setName(customerName);
                customerList3.get(i).setBirthDay(customerBirthDay);
                customerList3.get(i).setGenders(customerGenders);
                customerList3.get(i).setIdentityCard(customerIdentityCard);
                customerList3.get(i).setPhoneNumber(customerPhone);
                customerList3.get(i).setEmail(customerEmail);
                customerList3.get(i).setCustomerType(customerType);
                customerList3.get(i).setAddress(customerAddress);

                ReadAndWriteCustomer.write(customerList3,false);
                System.out.println("Edited.");
            }
        }
    }

    @Override
    public void deleteService() {
        displayService();
        List<Customer> customerList2 = ReadAndWriteCustomer.read();
        System.out.print("Enter service's code to delete:");
        String serviceCodeDelete = sc.nextLine();
        for(int i = 0 ; i < customerList2.size() ; i++){
            if (serviceCodeDelete.equals(customerList2.get(i).getCode())){
                customerList2.remove(i);
                ReadAndWriteCustomer.write(customerList2,false);
            }
        }
        System.out.println("Deleted");
    }

    @Override
    public void displayService() {
        System.out.println("-----List of customer-----");
        List<Customer> customerList1 = ReadAndWriteCustomer.read();
        for (Customer customer : customerList1) {
            System.out.println(customer);
        }
    }
}
