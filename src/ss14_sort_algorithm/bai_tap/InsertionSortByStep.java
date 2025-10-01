package ss14_sort_algorithm.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Bước "+i);
            int key = arr[i];
            System.out.println("Gán key bằng "+arr[i]);
            int j = i - 1;

            // Dời các phần tử lớn hơn key sang phải
            while (j >= 0 && arr[j] > key) {
                System.out.println(Arrays.toString(arr));
                arr[j + 1] = arr[j];
                j--;
            }

            // Chèn key vào đúng vị trí
            arr[j + 1] = key;
            System.out.println("Mảng sau "+i+" lần sort: "+ Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

}
