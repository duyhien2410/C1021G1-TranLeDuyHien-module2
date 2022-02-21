package ss3.baitap.timphantulonnhattrongmang2chieu;

import java.util.Scanner;

public class PhanTuLonNhat {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        n = scanner.nextInt();

        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        int max = A[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng = " + max);
    }
}
