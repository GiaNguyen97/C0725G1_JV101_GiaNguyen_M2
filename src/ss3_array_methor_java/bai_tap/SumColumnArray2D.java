package ss3_array_methor_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumColumnArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài mảng 2 chiều: ");
        byte rowArray2D = scanner.nextByte();
        System.out.print("Nhập chiều rộng mảng 2 chiều: ");
        byte colArray2D = scanner.nextByte();
        short[][] array2D = new short[rowArray2D][colArray2D];
        for (byte i = 0; i < array2D.length; i++) {
            for (byte j = 0; j < array2D[i].length; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                array2D[i][j] = scanner.nextShort();
            }
        }
        for (short[] value : array2D) {
            System.out.println(Arrays.toString(value));
        }
        System.out.print("Nhập cột bạn muốn tính tổng: ");
        byte columnSum = scanner.nextByte();

        short sumColumn = 0;
        for (short[] shorts : array2D) {
            sumColumn += shorts[columnSum-1];
        }
        System.out.println("Tổng cột thứ "+columnSum+" bằng: "+sumColumn);

    }
}
