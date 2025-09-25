package product_read_write_file;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {

    private static final String FILE_PATH = "E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\product_read_write_file\\list_product.csv";



    public boolean add(Product product) {
        List<String> stringList = new ArrayList<>();
        stringList.add(product.getInfoToSCV());
        try {
            ReadAndWriteFile.writeListStringToCSV(FILE_PATH, stringList, true);
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
        return true;
    }

    public void edit(int index, String name, int price) {
        List<Product> productList = displayAll();
        productList.get(index).setName(name);
        productList.get(index).setPrice(price);
        List<String> strings = new ArrayList<>();
        for (Product product : productList) {
            strings.add(product.getInfoToSCV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(FILE_PATH, strings, false);
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
    }

    public Product find(int index) {
        List<Product> productList = displayAll();
        if (index >= 0 && index < productList.size()) {
            return productList.get(index);
        }
        return null;
    }

    public List<Product> find(List<Integer> listIndex) {
        List<Product> productList = displayAll();
        List<Product> products = new ArrayList<>();
        for (int index : listIndex) {
            if (index >= 0 && index < productList.size()) {
                products.add(productList.get(index));
            }
        }
        return products;
    }

    public void delete(List<Integer> listIndex) {
        List<Product> productList = displayAll();
        listIndex.sort(Collections.reverseOrder());
        for (int index : listIndex) {
            if (index >= 0 && index < productList.size()) {
                productList.remove(index);
            }
        }
        List<String> strings = new ArrayList<>();
        for (Product product : productList) {
            strings.add(product.getInfoToSCV());
        }
        try {
            ReadAndWriteFile.writeListStringToCSV(FILE_PATH, strings, false);
        } catch (IOException e) {
            System.out.println("lỗi đọc file");
        }
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
        List<Product> productList = displayAll();
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
