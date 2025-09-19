package ss10_DSA_list.bai_tap.bai1_my_arraylist;

public class TestMyArrayList {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Nguyen");
        Student b = new Student(2, "Hoang");
        Student c = new Student(3, "Tung");
        Student d = new Student(4, "Khanh");
        Student e = new Student(5, "Nghiem");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        System.out.println("Mảng sau khi thêm phần tử:");
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            System.out.println(studentMyArrayList.get(i));
        }
        studentMyArrayList.add(2, e);
        System.out.println("Mảng sau khi thêm " + e +" vào vị trí thứ 2");
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            System.out.println(studentMyArrayList.get(i));
        }
        System.out.println("Độ dài mảng: " + studentMyArrayList.size());
        System.out.println("Vị trí " + c + "trong mảng: " + studentMyArrayList.indexOf(c));
        System.out.println("Xóa: " + studentMyArrayList.remove(2));
        System.out.println("Còn " + e + " trong mảng: " + studentMyArrayList.contains(e));
        newMyArrayList = studentMyArrayList.clone();
        System.out.println("Mảng mới được coppy từ mảng cũ");
        for (int i = 0; i < newMyArrayList.size(); i++) {
            System.out.println(newMyArrayList.get(i));
        }
        studentMyArrayList.clear();
        System.out.println("Độ dài mảng sau khi xóa: " + studentMyArrayList.size());
    }
}
