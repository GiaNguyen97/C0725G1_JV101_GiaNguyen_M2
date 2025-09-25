package product_read_write_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {

    private static final String FILE_PATH = "E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\product_read_write_file\\list_product.csv";



    public void add(String id, String name, int price) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(id, name, price));
        ReadAndWriteFile.writeListStringToCSV(FILE_PATH, productList);
    }

    public void edit(int index, String name, int price) {
        List<Product> productList = new ArrayList<>();
        productList.get(index).setName(name);
        productList.get(index).setPrice(price);
        ReadAndWriteFile.writeListStringToCSV(FILE_PATH, productList);
    }

    public Product find(int index) {
        List<Product> productList = new ArrayList<>();
        if (index >= 0 && index < productList.size()) {
            return productList.get(index);
        }
        return null;
    }

    public List<Product> find(List<Integer> listIndex) {
        List<Product> productList = new ArrayList<>();
        List<Product> products = new ArrayList<>();
        for (int index : listIndex) {
            if (index >= 0 && index < productList.size()) {
                products.add(productList.get(index));
            }
        }
        return products;
    }

    public void delete(List<Integer> listIndex) {
        List<Product> productList = new ArrayList<>();
        listIndex.sort(Collections.reverseOrder());
        for (int index : listIndex) {
            if (index >= 0 && index < productList.size()) {
                productList.remove(index);
            }
        }
        ReadAndWriteFile.writeListStringToCSV(FILE_PATH, productList);
    }

    public List<Product> displayAll() {
        List<Product> productList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        try {
            stringList = ReadAndWriteFile.readFileCSVToList(FILE_PATH);
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }
        String[] strings;
        for (String line: stringList){
            strings = line.split(",");
            Product product = new Product(strings[0],strings[1],Integer.parseInt(strings[2]));
            productList.add(product);
        }
        return productList;
    }

    public List<Integer> findIndexByInfor(Object value, String infor){
        List<Product> productList = new ArrayList<>();
        List<Integer> listIndex = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            Product p = productList.get(i);
            switch (infor) {
                case "id" -> {
                    if (p.getId().equals(value)) listIndex.add(i);
                }
                case "tên" -> {
                    if (p.getName().equals(value)) listIndex.add(i);
                }
                case "giá" -> {
                    if (p.getPrice() == (Integer) value) listIndex.add(i);
                }
            }
        }
        return listIndex;
    }
}
