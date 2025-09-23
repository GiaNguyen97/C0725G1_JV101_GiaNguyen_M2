package ss12_Map_Tree.bai_tap.product_manager.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
    private List<Product> listProduct = new LinkedList<>();

    {
        this.add("1", "sản phẩm A", 100000);
        this.add("2", "sản phẩm B", 200000);
    }

    public void add(String id, String name, int price) {
        listProduct.add(new Product(id, name, price));
    }

    public void edit(int index, String name, int price) {
        if (index >= 0 && index < listProduct.size()) {
            Product product = listProduct.get(index);
            product.setName(name);
            product.setPrice(price);
        }
    }

    public Product find(int index) {
        if (index >= 0 && index < listProduct.size()) {
            return listProduct.get(index);
        }
        return null;
    }

    public void delete(int index) {
        if (index >= 0 && index < listProduct.size()) {
            listProduct.remove(index);
        }
    }

    public void displayAll() {
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public int findIndexById(String id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}


