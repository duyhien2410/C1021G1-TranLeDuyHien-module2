package ss19_string_regex.bai_tap.validate_so_dien_thoai;

import java.util.Scanner;

public class TestPhoneNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String REGEX = "^\\d{2}[-][0]\\d{9}$";

        do{
            System.out.println("Nhập vào số điện thoại:");
            String phoneNumber = sc.nextLine();

            boolean check = phoneNumber.matches(REGEX);
            System.out.println(check);
        } while(true);
    }
}
