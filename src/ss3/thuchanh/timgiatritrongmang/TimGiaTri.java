package ss3.thuchanh.timgiatritrongmang;

import java.util.Scanner;

public class TimGiaTri {
    public static void main(String[] args) {
        String[] students = {"Hải ở dưới","Trường trên dịch","Phương trên giàn","Khoa buffalo"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found" + name + " in the list.");
        }
    }
}
