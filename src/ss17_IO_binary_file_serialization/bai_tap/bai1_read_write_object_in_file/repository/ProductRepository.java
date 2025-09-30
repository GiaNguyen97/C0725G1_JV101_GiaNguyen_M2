package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.repository;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity.Product;
import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.uti.ReadAndWriteProduct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String FILE_PATH = "E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\ss17_IO_binary_file_serialization\\bai_tap\\bai1_read_write_object_in_file\\data\\list_product.dat";

    public List<Product> findAll() {
        try {
            return ReadAndWriteProduct.readListProductFromFile(FILE_PATH);
        } catch (IOException e) {

            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            System.out.println("Lỗi tìm không ra file");
            return new ArrayList<>();
        }
    }


    @Override
    public boolean add(Product product) {
        List<Product> products = findAll();
        products.add(product);
        try {
            ReadAndWriteProduct.writeListProductToFile(FILE_PATH, products);
            return true;
        } catch (IOException ignored) {

        }
        return false;
    }

    @Override
    public Product find(int index) {
        List<Product> products = findAll();
        return products.get(index);
    }

    @Override
    public int findById(String id) {
        List<Product> products = findAll();
        if (products != null) {
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).getId().equals(id)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
