package ss2_Vong_lap_trong_Java.Baitap.ss2Hienthicacloaihinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu: "+
                "1. Print the rectangle\n" +
                "2.Print the square triangle\n" +
                "3.Print isosceles triangle\n" +
                "4.Exit\n");
        System.out.println("Choose menu: ");
        int chooseMenu=Integer.parseInt(sc.nextLine());
        switch (chooseMenu){
            case 1:
                System.out.println("Enter lenght:" );
                int lenght= sc.nextInt();
                System.out.println("Enter width: ");
                int width= sc.nextInt();
                for (int i=0;i<lenght;i++){
                    for (int j=0;j<width;j++){
                        System.out.print("*\t");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for(int i=1; i<=5; i++){
                    for(int j=1; j<i; j++){
                        System.out.print("*\t");
                    }
                    System.out.println("\n");
                }
                break;
            case 3:
                for(int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*\t");
                    }
                    System.out.println("\t");
                }
        }
    }
}
