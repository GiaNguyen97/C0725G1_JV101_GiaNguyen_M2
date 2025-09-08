package ss1.bai_tap;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int rate = 23000;
        System.out.println("Nhập số USD bạn muốn đổi");
        double usd = scanner.nextInt();
        double result = usd * rate;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat vndFormat = NumberFormat.getCurrencyInstance(localeVN);
        System.out.println(usFormat.format(usd) + " bằng " + vndFormat.format(result));

    }
}
