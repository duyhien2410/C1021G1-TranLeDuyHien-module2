package oop_review.quan_ly_tai_khoan_ngan_hang;

import java.util.Scanner;

public class RunAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Nhập tên tài khoản: ");
        account.setAcName(sc.nextLine());
        System.out.print("Nhập số tài khoản: ");
        account.setAcNumber(sc.nextLong());
        System.out.println(account);

        System.out.println("\nChọn phương thức: \n" +
                "1. Nạp tiền\n" +
                "2. Rút tiền\n" +
                "3. Đáo hạn\n");
        short choose = sc.nextShort();
        switch (choose) {
            case 1:
                System.out.println("Nhập số tiền muốn nạp: ");
                account.topUp = sc.nextDouble();

                while (account.topUp < 0) {
                    System.out.println("Số tiền bạn nhập quá ít, xin thao tác lại: ");
                    account.topUp = sc.nextDouble();
                }

                account.topUp();
                account.setAcBalance(account.topUp());
                System.out.println("Nạp tiền thành công: " + account);
                break;
            case 2:
                System.out.println("Nhập số tiền muốn rút: ");
                account.withdrawals = sc.nextDouble();

                while (account.withdrawals > account.getAcBalance()) {
                    System.out.println("Số tiền bạn nhập lớn hơn số dư tài khoản, xin thao tác lại: ");
                    account.withdrawals = sc.nextDouble();
                }

                account.withdrawals();
                account.setAcBalance(account.withdrawals());
                System.out.println("Rút tiền thành công: " + account);
                break;
            case 3:
                System.out.println("Tiền đáo hạn tài khoản của bạn: ");
                account.expire();
                System.out.println(account.expire());
                break;
        }
    }
}
