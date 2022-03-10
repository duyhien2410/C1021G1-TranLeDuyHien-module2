package ss12_java_collection_framwork.thuc_hanh.sap_xep_voi_comparator_va_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Hải bánh", 24, "HT");
        Student student1 = new Student("Trường cow", 22, "HN");
        Student student2 = new Student("Phương", 29, "HT" );
        Student student3 = new Student("Khoa", 19, "HT" );

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for(Student st : lists){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sánh theo tuổi:");
        for(Student st : lists){
            System.out.println(st.toString());
        }
    }
}
