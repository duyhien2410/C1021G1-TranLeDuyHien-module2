package ss6_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(point3D.getX(), point3D.getY(), 7);
        System.out.println(point3D);
    }
}
