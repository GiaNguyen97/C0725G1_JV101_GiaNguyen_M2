package ss6_inheritance.bai_tap.triangle;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài ba cạnh tam giác");
        System.out.print("a= ");
        double a = scanner.nextDouble();
        System.out.print("b= ");
        double b = scanner.nextDouble();
        System.out.print("c= ");
        double c = scanner.nextDouble();
        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            Triangle triangle = new Triangle(a,b,c);
            System.out.println(triangle);
        } else {
            System.out.println("Độ dài 3 cạnh bạn nhập không thể tạo nên 1 tam giác!");
        }
    }
}
