package ss5.bai_tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rad;

        System.out.println("Nhập vào bán kính của hình tròn: ");
        rad = sc.nextDouble();

        Circle circle = new Circle(rad);

        System.out.println("Bán kính hình tròn là: " + circle.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle.getArea());

    }
}
