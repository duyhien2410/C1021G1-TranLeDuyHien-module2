package ss5.baitap.xaydunglopchighitrongjava;

public class Student {
    private String name="John";
    private String classes="C02";
    public Student(){
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String getName() {
        return name;
    }
    public String getClasses() {
        return classes;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student2.setName("Hien");
        student2.setClasses("C1021G1");
        System.out.println(student1.getName());
        System.out.println(student1.getClasses());
        System.out.println(student2.getName());
        System.out.println(student2.getClasses());
    }

}
