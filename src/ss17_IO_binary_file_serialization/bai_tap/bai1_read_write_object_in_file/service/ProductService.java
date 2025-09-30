package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.service;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity.Product;
import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.repository.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private ProductRepository productRepository = new ProductRepository();
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public boolean add(Product product) {
        return productRepository.add(product);
    }

    @Override
    public Product find(int index) {
        return productRepository.find(index);
    }

    @Override
    public int findById(String id) {
        return productRepository.findById(id);
    }


}
