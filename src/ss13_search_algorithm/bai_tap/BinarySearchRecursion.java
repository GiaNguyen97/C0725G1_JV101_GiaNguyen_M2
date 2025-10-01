package ss13_search_algorithm.bai_tap;

public class BinarySearchRecursion {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] arr, int low, int high, int value) {
        if (low <= high) {
            int mid = (high+low) / 2;

            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] > value) {

                return binarySearch(arr, low, mid - 1, value);
            } else {

                return binarySearch(arr, mid + 1, high, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 0, list.length-1, 2));
        System.out.println(binarySearch(list, 0, list.length-1, 11));
        System.out.println(binarySearch(list, 0, list.length-1, 79));
        System.out.println(binarySearch(list, 0, list.length-1, 1));
        System.out.println(binarySearch(list, 0, list.length-1, 5));
        System.out.println(binarySearch(list, 0, list.length-1, 80));
    }
}
