package ss3_mang_va_phuong_thuc.bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int size, i, j;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào độ dài của mảng: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int A[] = new int[size];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("Nhập số nguyên cần xoá của mảng: ");

        int delete = scanner.nextInt();
        for (j = i = 0; i < size; i++) {
            if (A[i] != delete) {
                A[j] = A[i];
                j++;
            }
        }
        size = j;
        System.out.println("Mảng còn lại sau khi xóa phần tử " + delete + " là: ");
        for (i = 0; i < size; i++) {
            System.out.print(A[i] + "\t");
        }
    }
}
