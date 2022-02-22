package ss3.thuc_hanh.dao_nguoc_cac_phan_tu_cua_mang;

import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr;

        System.out.println("Nhập vào độ dài mảng: ");
        int size= sc.nextInt();

        if (size>20){
            System.out.println("Độ dài mảng vượt quá 20.");
        }

        arr=new int[size];
        int i=0;
        while (i<arr.length){
            System.out.print("Nhập vào phần tử "+(i+1)+":");
            arr[i]= sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s","Mảng vừa nhập: ","");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j] + "\t");
        }

        for (int j=0;j<arr.length/2;j++){
            int temp=arr[j];
            arr[j]=arr[size-1-j];
            arr[size-1-j]=temp;
        }
        System.out.printf("\n%-20s%s","Mảng đảo ngược: ","");
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
    }
}
