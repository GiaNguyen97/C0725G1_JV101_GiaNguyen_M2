package ss1.bai_tap;

import java.util.Scanner;

public class ReadNumberVietnamese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số bạn cần đọc ");
        short number = scanner.nextShort();
        String readNumberVietnamese = "";
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        if (number > 0 && number <= 999) {
            if (hundreds > 0) {
                switch (hundreds) {
                    case 1:
                        readNumberVietnamese += "Một";
                        break;
                    case 2:
                        readNumberVietnamese += "Hai";
                        break;
                    case 3:
                        readNumberVietnamese += "Ba";
                        break;
                    case 4:
                        readNumberVietnamese += "Bốn";
                        break;
                    case 5:
                        readNumberVietnamese += "Năm";
                        break;
                    case 6:
                        readNumberVietnamese += "Sáu";
                        break;
                    case 7:
                        readNumberVietnamese += "Bảy";
                        break;
                    case 8:
                        readNumberVietnamese += "Tám";
                        break;
                    case 9:
                        readNumberVietnamese += "Chín";
                        break;
                }
                readNumberVietnamese += " trăm";
            }
            if (tens > 0) {
                readNumberVietnamese += " ";
                if (tens == 1) {
                    readNumberVietnamese += "mười";
                } else {
                    switch (tens) {
                        case 2:
                            readNumberVietnamese += "hai";
                            break;
                        case 3:
                            readNumberVietnamese += "ba";
                            break;
                        case 4:
                            readNumberVietnamese += "bốn";
                            break;
                        case 5:
                            readNumberVietnamese += "năm";
                            break;
                        case 6:
                            readNumberVietnamese += "sáu";
                            break;
                        case 7:
                            readNumberVietnamese += "bảy";
                            break;
                        case 8:
                            readNumberVietnamese += "tám";
                            break;
                        case 9:
                            readNumberVietnamese += "chín";
                            break;
                    }
                    readNumberVietnamese += " mươi";

                }
            } else if (hundreds > 0 && ones > 0) {
                readNumberVietnamese += " lẻ";
            }
            if (ones > 0) {
                readNumberVietnamese += " ";
                if (tens >= 2 && ones == 1) {
                    readNumberVietnamese += "mốt";
                } else if (tens >= 1 && ones == 5) {
                    readNumberVietnamese += "lăm";
                } else {
                    switch (ones) {
                        case 1:
                            readNumberVietnamese += "một";
                            break;
                        case 2:
                            readNumberVietnamese += "hai";
                            break;
                        case 3:
                            readNumberVietnamese += "ba";
                            break;
                        case 4:
                            readNumberVietnamese += "bốn";
                            break;
                        case 5:
                            readNumberVietnamese += "năm";
                            break;
                        case 6:
                            readNumberVietnamese += "sáu";
                            break;
                        case 7:
                            readNumberVietnamese += "bảy";
                            break;
                        case 8:
                            readNumberVietnamese += "tám";
                            break;
                        case 9:
                            readNumberVietnamese += "chín";
                            break;
                    }
                }
            }


        } else if (number == 0) {
            readNumberVietnamese += "Không";
        } else {
            readNumberVietnamese += "Số không nằm trong phạm vi đọc của tôi";
        }
        System.out.println(readNumberVietnamese);
    }
}
