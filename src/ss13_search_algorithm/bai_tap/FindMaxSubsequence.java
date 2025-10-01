package ss13_search_algorithm.bai_tap;

import java.util.Scanner;

public class FindMaxSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String text = scanner.nextLine();

        StringBuilder maxSubsequence = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            StringBuilder subsequence = new StringBuilder();
            subsequence.append(text.charAt(i));
            for (int j = i + 1; j < text.length() ; j++) {
                if (subsequence.charAt(subsequence.length() - 1) < text.charAt(j)) {
                    subsequence.append(text.charAt(j));
                }
            }
            if (maxSubsequence.length() < subsequence.length()) {
                maxSubsequence.setLength(0);
                maxSubsequence.append(subsequence);
            }
            subsequence.setLength(0);
        }

        System.out.println("Chuỗi con theo thứ tự tăng dần dài nhất là: " + maxSubsequence);
    }

}
