package ss2_Vong_lap_trong_Java.Baitap.ss2Hienthicacloaihinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        int height;
        int width;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the width");
                    width = input.nextInt();
                    System.out.println("Enter the height");
                    height = input.nextInt();
                    for (int i=0; i<width; i++){
                        for (int j=0; j<height; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i=1;i<=5;i++){
                        for (int j=1;j<=i;j++){
                            System.out.print(" *");
                        }System.out.println();
                    }
                    break;
                case 3:
                    for (int i=7;i>=1;i--){
                        for (int j=1;j<=i;j++){
                            System.out.print(" * ");
                        }System.out.println();
                    }
            }
        }
    }
}
