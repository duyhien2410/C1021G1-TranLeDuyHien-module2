package collection_review.controller;

import collection_review.service.impl.Experience;
import collection_review.service.impl.Fresher;
import collection_review.service.impl.Intern;

import java.util.Locale;
import java.util.Scanner;

public class RunCandidate {
    public static void main(String[] args) {
        boolean flag = true;
        String yes = "yes";

        Scanner sc = new Scanner(System.in);
        Experience experience = new Experience();
        Fresher fresher = new Fresher();
        Intern intern = new Intern();
        do {
            System.out.print("\nCANDIDATE MANAGEMENT SYSTEM" +
                    "\n1.Experience" +
                    "\n2.Fresher" +
                    "\n3.Intern" +
                    "\n4.Searching" +
                    "\n5.Exit" +
                    "\nEnter your choice: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    experience.addCandidate();
                    break;
                case 2:
                    fresher.addCandidate();
                    break;
                case 3:
                    intern.addCandidate();
                    break;
                case 4:
                    System.out.print("Search:" +
                            "\n1.EXPERIENCE CANDIDATE" +
                            "\n2.FRESHER CANDIDATE" +
                            "\n3.INTERN CANDIDATE" +
                            "\nEnter your choice: ");
                    int choose1 = Integer.parseInt(sc.nextLine());
                    switch (choose1){
                        case 1:
                            experience.displayCandidate(); ;
                            System.out.print("\nDo you want to see more information from list?"+
                                    "\nYes"+
                                    "\nNo"+
                                    "\nEnter your choice: ");
                            String choice1 = sc.nextLine();
                            if(choice1.toLowerCase(Locale.ROOT).contains(yes)){
                                experience.searchCandidate();
                            } else {
                                System.out.print("Error");
                            }
                            break;
                        case 2:
                            fresher.displayCandidate();
                            System.out.print("\nDo you want to see more information from list?"+
                                    "\nYes"+
                                    "\nNo"+
                                    "\nEnter your choice: ");
                            String choice2 = sc.nextLine();
                            if(choice2.toLowerCase(Locale.ROOT).contains(yes)){
                                fresher.searchCandidate();
                            } else {
                                System.out.print("Error");
                            }
                            break;
                        case 3:
                            intern.displayCandidate();
                            System.out.print("\nDo you want to see more information from list?"+
                                    "\nYes"+
                                    "\nNo"+
                                    "Enter your choice: ");
                            String choice3 = sc.nextLine();
                            if(choice3.toLowerCase(Locale.ROOT).contains(yes)){
                                intern.searchCandidate();
                            } else {
                                System.out.print("Error");
                            }
                            break;
                    }
                    break;

                default:
                    System.out.println("Error");
                    flag = false;
                    break;
            }

        } while (flag);
    }
}
