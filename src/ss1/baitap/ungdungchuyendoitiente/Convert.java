package ss1.baitap.ungdungchuyendoitiente;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        double usd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter USD:");
        usd= sc.nextDouble();
        double convert=usd*23000;
        System.out.println("convert VND: "+convert);
    }
}
