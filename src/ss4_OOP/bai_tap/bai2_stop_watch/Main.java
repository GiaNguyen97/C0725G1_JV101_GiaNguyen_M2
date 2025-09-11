package ss4_OOP.bai_tap.bai2_stop_watch;

public class Main {
    public static void main(String[] args) {
        int size = 100000;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 2000 - 1000);
        }
        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();

        StopWatch stopwatch = new StopWatch();

        stopwatch.start();
        selectionSort(arr1);
        stopwatch.stop();
        System.out.println("Thời gian thực thi sắp xếp selectionSort cho 100.000 số: " + stopwatch.getElapsedTime() + " ms");

        stopwatch.start();
        insertionSort(arr2);
        stopwatch.stop();
        System.out.println("Thời gian thực thi sắp xếp insertionSort cho 100.000 số: " + stopwatch.getElapsedTime() + " ms");

        stopwatch.start();
        quickSort(arr3, 0, arr3.length - 1);
        stopwatch.stop();
        System.out.println("Thời gian thực thi sắp xếp quickSort cho 100.000 số: " + stopwatch.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
