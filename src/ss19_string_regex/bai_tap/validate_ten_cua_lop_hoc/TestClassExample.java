package ss19_string_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.Scanner;

public class TestClassExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String REGEX =   "^[CAP]\\d{4}[GHIKLM]$";

        do {
            System.out.println("Nhập vào tên lớp học:");
            String className = sc.nextLine();

            boolean check = className.matches(REGEX);
            System.out.println(check);

        } while (true);
    }
}
