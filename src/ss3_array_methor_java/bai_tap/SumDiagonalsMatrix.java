package ss3_array_methor_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonalsMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài của ma trận vuông: ");
        byte rowMatrix = scanner.nextByte();
        short[][] matrix = new short[rowMatrix][rowMatrix];
        for (byte i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[i].length; j++) {
                System.out.print("Nhập phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextShort();
            }
        }
        for (short[] value : matrix) {
            System.out.println(Arrays.toString(value));
        }
        short sumDiagonals = 0;
        for (byte i = 0; i < matrix.length; i++) {
            sumDiagonals += matrix[i][i];
            sumDiagonals += matrix[i][matrix.length-i-1];
        }
        System.out.println("Tổng 2 đường chéo của ma trận vuông bằng "+sumDiagonals);
    }
}
