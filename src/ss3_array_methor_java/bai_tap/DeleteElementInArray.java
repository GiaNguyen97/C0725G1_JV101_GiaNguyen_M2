package ss3_array_methor_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        short[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử cần muốn xóa");
        short elementDelte = scanner.nextShort();
        for (short i = 0; i < array.length; i++) {
            if (array[i] == elementDelte) {
                for (short j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
                break;
            }
        }
        System.out.println("Mảng sau khi đã xóa phần tử " + elementDelte);
        System.out.println(Arrays.toString(array));
    }
}
