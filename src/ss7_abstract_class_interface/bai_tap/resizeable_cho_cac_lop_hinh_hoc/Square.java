package ss7_abstract_class_interface.bai_tap.resizeable_cho_cac_lop_hinh_hoc;

public class Square extends Shape implements Resizeable {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "side="
                + side
                + ","
                + super.toString()
                + '}'
                + ", Area=" +
                +getArea();
    }

    double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        this.side *= (percent / 200);
    }
}
