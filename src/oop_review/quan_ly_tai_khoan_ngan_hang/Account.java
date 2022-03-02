package oop_review.quan_ly_tai_khoan_ngan_hang;

public class Account {
    private long acNumber;
    private String acName;
    private double acBalance = 50;
    public final double INTEREST_RATE = 0.035;
    public double topUp;
    public double withdrawals;
    public double transferAmount;

    public Account() {
    }

    public Account(long acNumber, String acName) {
        this.acNumber = acNumber;
        this.acName = acName;
    }

    public Account(long acNumber, String acName, double acBalance) {
        this.acNumber = acNumber;
        this.acName = acName;
        this.acBalance = acBalance;
    }

    public long getAcNumber() {
        return acNumber;
    }

    public void setAcNumber(long acNumber) {
        this.acNumber = acNumber;
    }

    public String getAcName() {
        return acName;
    }

    public void setAcName(String acName) {
        this.acName = acName;
    }

    public double getAcBalance() {
        return acBalance;
    }

    public void setAcBalance(double acBalance) {
        this.acBalance = acBalance;
    }

    public double getTopUp() {
        return topUp;
    }

    public void setTopUp(double topUpp) {
        this.topUp = topUpp;
    }

    public double getWithdrawals() {
        return withdrawals;
    }

    public void setWithdrawals(double withdrawals) {
        this.withdrawals = withdrawals;
    }

    public double topUp(){
        return acBalance + topUp;
    }

    public double withdrawals(){
        return acBalance - withdrawals;
    }

    public double expire(){
        return acBalance + acBalance* INTEREST_RATE;
    }

    public double transfer(){
        return getAcBalance()-transferAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "acNumber=" + acNumber +
                ", acName='" + acName + '\'' +
                ", acBalance=" + acBalance +
                '}';
    }
}
