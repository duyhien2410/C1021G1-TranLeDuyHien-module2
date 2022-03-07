package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InternSortByStep {
    public static void intertionSort(int[] list){
        int x;
        int pos;
        for (int i = 1; i<list.length; i++){
            x = list[i];
            pos = i;
            while (0<pos && x<list[pos - 1]){
                list[pos] = list[pos-1];
                pos--;
                System.out.println("\nLần thứ "+i+" "+ Arrays.toString(list));
            }
            list[pos]=x;
            System.out.println("Sau lần thứ "+i+": "+Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng:");
        int size = scanner.nextInt();

        int[] list = new int[size];
        System.out.println("Nhập " + list.length + " phần tử:");

        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập: ");

        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }

        intertionSort(list);
    }
}
