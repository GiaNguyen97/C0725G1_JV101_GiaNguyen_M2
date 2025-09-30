package ss17_IO_binary_file_serialization.bai_tap.bai2_read_write_object_briany_file;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity.Product;

import java.io.*;
import java.util.List;

public class CopyByteFile {
    public static void writeListProductToFile(String path, List<Product> products) throws IOException {
        File file = new File(path);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(products);
        }
        File infoFile = new File(path + ".info.txt");
        try (FileWriter fileWriter = new FileWriter(infoFile)) {
            fileWriter.write("Số byte trong file là: " + new File(path).length() + " byte");
        }
    }

    public static List<Product> readListProductFromFile(String path) throws IOException, ClassNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (List<Product>) objectInputStream.readObject();
        }
    }

    public static void main(String[] args) {
        try {
            List<Product> products = readListProductFromFile("E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\ss17_IO_binary_file_serialization\\bai_tap\\bai1_read_write_object_in_file\\data\\list_product.dat");
            writeListProductToFile("E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\ss17_IO_binary_file_serialization\\bai_tap\\bai2_read_write_object_briany_file\\target_file.dat", products);
            System.out.println("Copy thành công. Đã tạo thêm file target_file.dat.info.txt chứa số byte.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
