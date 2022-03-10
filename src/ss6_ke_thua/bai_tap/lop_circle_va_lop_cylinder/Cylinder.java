package ss6_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class Cylinder extends Circle{
    private int height=5;

    public Cylinder(){
    }

    public Cylinder(int height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, int height) {
        super(radius, color);
        this.height = height;
    }

    public double getCapacity(){
        return getArea()*height;
    }

    @Override
    public String toString() {
        return "\n"+super.toString()+
                "\n Cylinder{" +
                "height=" + height +
                ", capacity="+getCapacity()+
                '}';
    }
}
