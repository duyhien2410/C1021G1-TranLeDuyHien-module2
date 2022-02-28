package oop_review.nhap_xuat_thong_tin_xe;

public class Run {
    public static void main(String[] args) {
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Dream(100,20000000);
        vehicles[1]=new Sirius(150,25000000);
        vehicles[2]=new Exciter(200,40000000);

        for (Vehicle vhl:vehicles) {
            System.out.println(vhl);
        }
    }
}
