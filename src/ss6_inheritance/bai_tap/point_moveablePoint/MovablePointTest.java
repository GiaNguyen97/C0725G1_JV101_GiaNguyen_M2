package ss6_inheritance.bai_tap.point_moveablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
         MovablePoint movablePoint = new MovablePoint(3,2,5,4);
        System.out.println(movablePoint);
         movablePoint.setSpeed(10,10);
        System.out.println(movablePoint);
        for (byte i=0;i<3;i++){
            System.out.println(movablePoint.move());
        }
    }
}
