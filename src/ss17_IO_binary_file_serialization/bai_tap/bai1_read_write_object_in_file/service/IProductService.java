package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.service;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    boolean add(Product product);
    Product find(int index);
    int findById(String id);
}
