package ss3_array_methor_java.bai_tap;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        String string = "Codegym.com";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập ký tự bạn muốn đếm: ");
        char character = scanner.nextLine().charAt(0);
        byte count = 0;
        for (byte i=0; i<string.length();i++) {
            if (character==string.charAt(i)){
                count++;
            }
        }
        System.out.println("Ký tự '"+character+"' xuất hiện "+count+" lần trong chuỗi '"+string+"'");
    }
}
