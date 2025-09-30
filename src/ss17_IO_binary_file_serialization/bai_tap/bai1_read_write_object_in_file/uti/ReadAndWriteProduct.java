package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.uti;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity.Product;

import java.io.*;

import java.util.List;

public class ReadAndWriteProduct {
    public static void writeListProductToFile(String path, List<Product> products) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(products);
        objectOutputStream.close();
        fileOutputStream.close();

    }

    public static List<Product> readListProductFromFile(String path) throws IOException, ClassNotFoundException {
        List<Product> products;
        FileInputStream fifileInputStream = new FileInputStream(path);
        ObjectInputStream objectInputStream = new ObjectInputStream(fifileInputStream);
        products = (List<Product>) objectInputStream.readObject();
        fifileInputStream.close();
        objectInputStream.close();
        return products;
    }
}
