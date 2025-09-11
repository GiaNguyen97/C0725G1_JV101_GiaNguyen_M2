package ss4_OOP.bai_tap.bai1_quadratic_equation;

public class QuadraticEquation {
    private byte a;
    private byte b;
    private byte c;

    public QuadraticEquation(byte a, byte b, byte c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(byte a) {
        this.a = a;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public byte getC() {
        return c;
    }

    public byte getA() {
        return a;
    }

    public byte getB() {
        return b;
    }

    public void setC(byte c) {
        this.c = c;
    }

    public byte getDiscriminant() {
        return (byte) (b * b - 4 * a * c);
    }

    public float getRoot1() {
        return (float) (-b + Math.sqrt(getDiscriminant()) / 2 * a);
    }

    public float getRoot2() {
        return (float) (-b - Math.sqrt(getDiscriminant()) / 2 * a);
    }
}
