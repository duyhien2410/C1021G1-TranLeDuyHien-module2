package case_study.controllers;

import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public void displayMainMenu(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do {
            System.out.println("Menu:\n" +
                    "1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tFacility Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.print("Input selection:");
            int choose1 = Integer.parseInt(sc.nextLine());
            switch (choose1){
                case 1:
                    System.out.println("Employee Management: \n" +
                            "1.\tDisplay list employees\n" +
                            "2.\tAdd new employee\n" +
                            "3.\tEdit employee\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("Input selection:");
                    int choose2 = Integer.parseInt(sc.nextLine());
                    switch (choose2){
                        case 1:
                            employeeService.displayService();
                            break;
                        case 2:
                            employeeService.addService();
                            break;
                        case 3:
                            employeeService.editService();
                            break;
                        case 4:
                            flag = true;
                    }
                    break;
                case 2:
                    System.out.println("Customer Management:\n" +
                            "1.\tDisplay list customers\n" +
                            "2.\tAdd new customer\n" +
                            "3.\tEdit customer\n" +
                            "4.\tReturn main menu\n");
                    System.out.print("Input selection:");
                    int choose3 = Integer.parseInt(sc.nextLine());
                    switch (choose3){
                        case 1:
                            customerService.displayService();
                            break;
                        case 2:
                            customerService.addService();
                            break;
                        case 3:
                            customerService.editService();
                            break;
                        case 4:
                            flag = true;
                    }
                    break;
                case 3:
                    System.out.println("Facility Management: "+
                            "1\tDisplay list facility\n" +
                            "2\tAdd new facility\n" +
                            "3\tDisplay list facility maintenance\n" +
                            "4\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose4 = Integer.parseInt(sc.nextLine());
                    break;
                case 4:
                    System.out.println("Facility Management:" +
                            "1.\tAdd new booking\n" +
                            "2.\tDisplay list booking\n" +
                            "3.\tCreate new constracts\n" +
                            "4.\tDisplay list contracts\n" +
                            "5.\tEdit contracts\n" +
                            "6.\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose5 = Integer.parseInt(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Promotion Management:" +
                            "1.\tDisplay list customers use service\n" +
                            "2.\tDisplay list customers get voucher\n" +
                            "3.\tReturn main menu\n");
                    System.out.println("Input selection:");
                    int choose6 = Integer.parseInt(sc.nextLine());
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (flag);

    }
}
