package ss3_array_methor_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArrayJava {
    public static void main(String[] args) {
        byte size1;
        short[] array1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1 :");
        size1 = scanner.nextByte();
        array1 = new short[size1];
        byte i = 0;
        while (i < array1.length) {
            System.out.print("Giá trị phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextShort();
            i++;
        }

        byte size2;
        short[] array2;
        System.out.print("Nhập độ dài mảng 2 :");
        size2 = scanner.nextByte();
        array2 = new short[size2];
        i = 0;
        while (i < array2.length) {
            System.out.print("Giá trị phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextShort();
            i++;
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        short[] array3 = new short[size1+size2];
        for (i=0;i<size1;i++) {
            array3[i] = array1[i];
        }
        for (i=0;i<size2;i++) {
            array3[i+size1] = array2[i];
        }
        System.out.println("Mảng 3 sao khi đã gộp 2 mảng trên là ");
        System.out.println(Arrays.toString(array3));
    }
}
