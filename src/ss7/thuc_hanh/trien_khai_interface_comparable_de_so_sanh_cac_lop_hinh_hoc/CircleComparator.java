package ss7.thuc_hanh.trien_khai_interface_comparable_de_so_sanh_cac_lop_hinh_hoc;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {


    @Override
    public int compare(Circle o1, Circle o2) {
        return (int) (o1.getRadius() - o2.getRadius());
    }
}
