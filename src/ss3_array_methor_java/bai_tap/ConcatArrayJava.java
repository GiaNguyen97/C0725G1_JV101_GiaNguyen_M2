package ss3_array_methor_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArrayJava {
    public static void main(String[] args) {
        int size1;
        int[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1 :");
        size1 = scanner.nextInt();
        array1 = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Giá trị phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
            i++;
        }

        int size2;
        int[] array2;
        System.out.print("Nhập độ dài mảng 2 :");
        size2 = scanner.nextInt();
        array2 = new int[size2];
        i = 0;
        while (i < array2.length) {
            System.out.print("Giá trị phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
            i++;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int[] array3 = new int[size1+size2];
        for (i=0;i<array1.length;i++) {
            array3[i] = array1[i];
        }
        for (i=0;i<array2.length;i++) {
            array3[i+array1.length] = array2[i];
        }
        System.out.println("Mảng 3 sao khi đã gộp 2 mảng trên là ");
        System.out.println(Arrays.toString(array3));
    }
}
