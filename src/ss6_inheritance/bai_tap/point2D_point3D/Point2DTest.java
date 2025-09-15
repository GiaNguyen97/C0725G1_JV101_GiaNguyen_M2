package ss6_inheritance.bai_tap.point2D_point3D;

import java.util.Arrays;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(32,24);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println(point2D);
    }
}
