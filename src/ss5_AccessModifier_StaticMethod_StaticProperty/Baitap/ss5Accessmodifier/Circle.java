package ss5_AccessModifier_StaticMethod_StaticProperty.Baitap.ss5Accessmodifier;

public class Circle {
    private  double radius =1.0;

    public Circle(){
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public static void main(String[] args) {
        Circle hinhtron = new Circle();
        Circle hinhtron2 = new Circle(3);
        System.out.println(hinhtron.getRadius());
        System.out.println(hinhtron.getArea());
        System.out.println(hinhtron2.getRadius());
        System.out.println(hinhtron2.getArea());
    }
}
