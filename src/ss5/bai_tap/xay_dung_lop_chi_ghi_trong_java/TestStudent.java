package ss5.bai_tap.xay_dung_lop_chi_ghi_trong_java;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student2.setName("Hien");
        student2.setClasss("C1221G1");
        System.out.println(student1.getName());
        System.out.println(student1.getClasss());
        System.out.println(student2.getName());
        System.out.println(student2.getClasss());
    }
}
