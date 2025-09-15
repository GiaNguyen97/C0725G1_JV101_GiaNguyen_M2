package ss6_inheritance.bai_tap.point2D_point3D;

import java.util.Arrays;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(3,1,4);
        System.out.println(Arrays.toString(point3D.getXYZ()));
        System.out.println(point3D);
    }
}
