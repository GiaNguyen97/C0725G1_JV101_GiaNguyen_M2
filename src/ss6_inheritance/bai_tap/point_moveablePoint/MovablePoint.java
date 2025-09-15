package ss6_inheritance.bai_tap.point_moveablePoint;

public class MovablePoint extends Point {
    float xSpeed;
    float ySpeed;

    public MovablePoint() {

    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }

    @Override
    public String toString() {
        return super.toString()+", speed=("+getxSpeed()+", "+getySpeed()+")";
    }

    public MovablePoint move() {
        super.setX(super.getX()+getxSpeed());
        super.setY(super.getY()+getySpeed());
        return this;
    }
}
