package ss2_vong_lap.bai_tap.hien_thi_cac_loai_hinh;

import java.util.Scanner;

public class DisplayGeometry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Menu: \n"+
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
                System.out.println("1.Print the square triangle(botton-left).\n"+
                        "2.Print the square triangle(top-left).\n");
                System.out.println("Choose: ");
                int choose=Integer.parseInt(sc.nextLine());
                switch (choose){
                    case 1:
                        for(int i=1; i<=5; i++){
                            for(int j=1; j<=i; j++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    case 2:
                        for (int i = 5; i >= 1; --i) {
                            for (int j = 1; j <= i; ++j) {
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                }
                break;
            case 3:
                int k=0;
                for (int i = 1; i <= 4; ++i, k = 0) {
                    for (int space = 1; space <= 4 - i; ++space) {
                        System.out.print("  ");
                    }
                    while (k != 2 * i - 1) {
                        System.out.print("* ");
                        ++k;
                    }
                    System.out.println();
                }
                break;
        }
    }
}
