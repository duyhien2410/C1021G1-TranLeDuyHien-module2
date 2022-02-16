package ss1_Introduction_to_Java.Thuchanh.ss1Tinhchisocannangcuacothe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập vào cân nặng của bạn: ");
        weight = sc.nextDouble();

        System.out.println("Nhập vào chiều cao của bạn: ");
        height = sc.nextDouble();

        bmi = weight/ Math.pow(height, 2);

        if (bmi<18){
            System.out.printf("%-25.2f%s", bmi, "Underweight");
        } else if (bmi<25){
            System.out.printf("%-25.2f%s", bmi, "Normal");
        } else if (bmi<30){
            System.out.printf("%-25.2f%s", bmi, "Overweight");
        } else {
            System.out.printf("%-25.2f%s", bmi, "Obese");
        }
    }
}
