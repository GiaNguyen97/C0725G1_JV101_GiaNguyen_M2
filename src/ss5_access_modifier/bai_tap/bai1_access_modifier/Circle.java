package ss5_access_modifier.bai_tap.bai1_access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return radius;
    }
    public double getArea (){
        return Math.PI*radius*radius;
    }
}
