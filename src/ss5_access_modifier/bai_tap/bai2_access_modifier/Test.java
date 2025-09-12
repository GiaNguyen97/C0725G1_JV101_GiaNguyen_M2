package ss5_access_modifier.bai_tap.bai2_access_modifier;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Nguyen");
        student.setClasses("C07");
        System.out.println(student);
    }
}
