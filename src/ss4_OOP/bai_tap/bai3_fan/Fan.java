package ss4_OOP.bai_tap.bai3_fan;

public class Fan {
    final byte SLOW = 1;
    final byte MEDIUM = 2;
    final byte FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean getOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return "Fan{" +
                    " fan is on" +
                    ", speed= " + speed +
                    ", color= '" + color +
                    "', radius= " + radius + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    " fan is off" +
                    ", color='" + color +
                    "', radius= " + radius + '\'' +
                    '}';
        }
    }
}
