package ss3_array_methor_java.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementInArray {
    public static void main(String[] args) {
        short[] array = {1, 2, 3, 4, 5, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        System.out.println("Nhập phần tử cần muốn thêm");
        short elementAdd = scanner.nextShort();
        System.out.println("Nhập vị trí muốn thêm vào");
        short indexAdd = scanner.nextShort();
        for (short i = 0; i < array.length; i++) {
            if (i == indexAdd) {
                for (int j = array.length-1; j > i; j--) {
                    array[j] = array[j - 1];
                }
                array[i] = elementAdd;
                break;
            }
        }
        System.out.println("Mảng sau khi đã thêm phần tử " + elementAdd + " vào vị trí thứ "+indexAdd);
        System.out.println(Arrays.toString(array));
    }
}
