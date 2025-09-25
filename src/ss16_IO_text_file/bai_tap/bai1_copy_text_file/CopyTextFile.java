package ss16_IO_text_file.bai_tap.bai1_copy_text_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyTextFile {
    public List<Character> readfile(String filePath) {
        List<Character> characterList = new ArrayList<>();
        try (FileReader reader = new FileReader(filePath)) {
            int data;
            while ((data = reader.read()) != -1) {
                characterList.add((char) data);
            }
        }
        catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return characterList;
    }

    public void writeFile(String filePath, List<Character> characterList){
        try (FileWriter writer = new FileWriter(filePath)) {
            for (char c : characterList) {
                writer.write(c);
            }
            writer.write("\nSố ký tự trong file là: " + characterList.size());
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CopyTextFile copyTextFile = new CopyTextFile();
        List<Character> characterList = copyTextFile.readfile("E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\ss16_IO_text_file\\bai_tap\\bai1_copy_text_file\\source_file.txt");
        copyTextFile.writeFile("E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\ss16_IO_text_file\\bai_tap\\bai1_copy_text_file\\target_file.txt",characterList);
    }
}
