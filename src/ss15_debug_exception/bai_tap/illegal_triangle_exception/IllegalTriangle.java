package ss15_debug_exception.bai_tap.illegal_triangle_exception;


import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài 3 cạnh tam giác");
        int aTriangle = 0;
        int bTriangle = 0;
        int cTriangle = 0;
        boolean exits = true;
        do {
            try {
                System.out.print("Nhập độ dài cạnh a: ");
                aTriangle = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập độ dài cạnh b: ");
                bTriangle = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập độ dài cạnh c: ");
                cTriangle = Integer.parseInt(scanner.nextLine());
                exits = false;
            } catch (NumberFormatException e) {
                System.err.println("Lỗi nhập chữ, vui lòng nhập lại");
                System.out.println(" ");

            }
        } while (exits);
        Triangle triangle = null;
        try {
            triangle = new Triangle(aTriangle, bTriangle, cTriangle);
            System.out.println(triangle);
        } catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());
        }


    }
}
