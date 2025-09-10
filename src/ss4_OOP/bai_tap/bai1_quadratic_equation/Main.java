package ss4_OOP.bai_tap.bai1_quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a: ");
        byte a = scanner.nextByte();
        System.out.print("Nhập b: ");
        byte b = scanner.nextByte();
        System.out.print("Nhập c: ");
        byte c = scanner.nextByte();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (b < 0 && c < 0) {
            System.out.println(a + "x² " + b + "x " + c + " = 0");
        } else if (b < 0) {
            System.out.println(a + "x² " + b + "x + " + c + " = 0");
        } else if (c < 0) {
            System.out.println(a + "x² + " + b + "x " + c + " = 0");
        } else {
            System.out.println(a + "x² + " + b + "x + " + c + " = 0");
        }

        byte delta = quadraticEquation.getDiscriminant();
        float root1 = quadraticEquation.getRoot1();
        float root2 = quadraticEquation.getRoot2();
        if (delta > 0) {
            System.out.println("Phương trình trên có 2 nghiệm là: " + root1 + " và " + root2);
        } else if (delta == 0) {
            System.out.println("Phương trình trên có 1 nghiệm là: " + root1);
        } else {
            System.out.println("Phương trình trên vô nghiệm");
        }
    }
}
