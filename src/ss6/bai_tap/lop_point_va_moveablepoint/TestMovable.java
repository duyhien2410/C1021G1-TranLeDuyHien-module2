package ss6.bai_tap.lop_point_va_moveablepoint;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint movablePoint=new MovablePoint();
        System.out.println("Move: "+movablePoint);
        movablePoint.setSpeed(1,2);
        movablePoint.move();
        System.out.println("Move 1: "+movablePoint);

        movablePoint.setSpeed(3,4);
        movablePoint.move();
        System.out.println("Move 1: "+movablePoint);

    }
}
