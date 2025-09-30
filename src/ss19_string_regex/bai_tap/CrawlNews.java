package ss19_string_regex.bai_tap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuilder content = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine).append("\n");
            }

            in.close();
            conn.disconnect();
            StringBuilder stringBuilderh3 = new StringBuilder();
            StringBuilder stringBuilderTile = new StringBuilder();
            System.out.println("Các tin tức chính trên trang dantri.com.vn mục thế giới");
            int start = content.indexOf("<h3");
            int end = content.indexOf("</h3>");
            int count = 1;
            while (start != -1) {
                stringBuilderh3.setLength(0);
                stringBuilderTile.setLength(0);
                for (int i = start; i <= end; i++) {
                    stringBuilderh3.append(content.charAt(i));
                }
                for (int i = stringBuilderh3.indexOf("m\">") + 3; i < stringBuilderh3.indexOf("</a>"); i++) {
                    stringBuilderTile.append(stringBuilderh3.charAt(i));
                }
                System.out.println("Tin tức thứ " + count + ": " + stringBuilderTile);
                count++;
                start = content.indexOf("<h3", start + 1);
                end = content.indexOf("</h3>", end + 1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}