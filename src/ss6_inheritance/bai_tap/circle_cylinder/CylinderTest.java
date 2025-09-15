package ss6_inheritance.bai_tap.circle_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3);
        cylinder.setRadius(2);
        System.out.println(cylinder);
        System.out.println("Chu vi = " + cylinder.getPerimeter() + ", diện tích = "+ cylinder.getArea() + ", thể tích = " + cylinder.getVolume());
    }
}
