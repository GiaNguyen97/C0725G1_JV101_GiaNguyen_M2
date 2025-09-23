package ss12_Map_Tree.bai_tap.product_manager.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> listProduct = new ArrayList<>();
    {
        this.add("1", "sản phẩm A", 100000);
        this.add("2", "sản phẩm B", 200000);
    }

    public void add(String id, String name, int price) {
        listProduct.add(new Product(id, name, price));
    }

    public void edit(byte index, String name, int price) {
        listProduct.get(index).setName(name);
        listProduct.get(index).setPrice(price);
    }

    public void find(byte index) {
        System.out.println(this.listProduct.get(index));
    }

    public void delete(byte index) {
        listProduct.remove(index);
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
