package ss15_xu_ly_ngoai_le_va_debug.bai_tap.su_dung_illegaltriangleexception;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cạnh thứ nhât của tam giác:");
        int edge1 = sc.nextInt();
        System.out.print("Nhập vào cạnh thứ hai của tam giác:");
        int edge2 = sc.nextInt();
        System.out.print("Nhập vào cạnh thứ ba của tam giác:");
        int edge3 = sc.nextInt();

        if (edge1 + edge2 <= edge3 || edge1 + edge3 <= edge2 || edge2 + edge3 <= edge1) {
            throw new IllegalTriangleException("Tổng 2 cạnh không thể nhỏ hơn cạnh còn lại.");
        } else if (edge1 < 1 || edge2 < 1 || edge3 < 1) {
            throw new IllegalTriangleException("Cạnh hình tam giác không thể nhỏ hơn 1.");
        } else {
            System.out.print("Hình tam giác có cạnh 1 = " + edge1 + ", cạnh 2 = " + edge2 + ", cạnh 3 = " + edge3);
        }
    }
}
