package ss10.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

public class TestMyList {
    public static class Student {
        private String id;
        private String name;

        public Student() {
        }

        public Student(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Student student1 = new Student("1", "Hải bánh");
            Student student2 = new Student("2", "Năm cam");
            Student student3 = new Student("3", "Trường xoăn");
            Student student4 = new Student("4", "Hưng phi nhon");
            Student student5 = new Student("5", "Sơn bạch tạng");
            Student student6 = new Student("6", "Thắng tài dậu");
            MyList<Student> studentMyList = new MyList<>();
            studentMyList.add(student1);
            studentMyList.add(student2);
            studentMyList.add(student3);
            studentMyList.add(student4);
            studentMyList.add(student5);
            studentMyList.add(student6);
            for (int i = 0; i < studentMyList.size(); i++) {
                Student student = (Student) studentMyList.elements[i];
                System.out.println(student);
            }
        }
    }
}
