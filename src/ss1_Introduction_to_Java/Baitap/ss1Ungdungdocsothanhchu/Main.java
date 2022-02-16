package ss1_Introduction_to_Java.Baitap.ss1Ungdungdocsothanhchu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập số cần đọc:");
        int number = sc.nextInt();

        if (number>0 && number<11){
            switch (number){
                case 1:
                    System.out.println("một");
                    break;
                case 2:
                    System.out.println("hai");
                    break;
                case 3:
                    System.out.println("ba");
                    break;
                case 4:
                    System.out.println("bốn");
                    break;
                case 5:
                    System.out.println("năm");
                    break;
                case 6:
                    System.out.println("sáu");
                    break;
                case 7:
                    System.out.println("bảy");
                    break;
                case 8:
                    System.out.println("tám");
                    break;
                case 9:
                    System.out.println("chín");
                    break;
                case 10:
                    System.out.println("mười");
                    break;
                default:
                    System.out.println("vượt quá hệ thống");
            }
        }
    }
}
