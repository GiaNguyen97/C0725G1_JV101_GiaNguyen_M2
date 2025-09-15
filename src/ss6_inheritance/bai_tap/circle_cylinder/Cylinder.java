package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 2.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public double getArea() {
        return super.getPerimeter()*(this.getRadius()+this.height);
    }

    public double getVolume() {
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString() +
                "height=" + height +
                '}';
    }
}
