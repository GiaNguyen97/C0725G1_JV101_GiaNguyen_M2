package ss5_access_modifier.bai_tap.bai3_demo_CRUD;

public class ProductManage {
    public Product[] listProduct = new Product[100];

    {
        this.add("1", "A", 10000);
        this.add("2", "B", 20000);
    }

    public void add(String id, String name, int price) {
        Product product = new Product(id, name, price);
        for (byte i = 0; i < listProduct.length; i++) {
            if (listProduct[i] == null) {
                listProduct[i] = product;
                break;
            }
        }
    }

    public void edit(byte index, String id, String name, int price) {
        listProduct[index].setId(id);
        listProduct[index].setName(name);
        listProduct[index].setPrice(price);
    }

    public void find() {

    }

    public void delete(byte index) {
        for (byte i = index; i < listProduct.length-1; i++) {
            boolean isNoNull = true;
            if (listProduct[i + 1] != null) {
                listProduct[i].setId(listProduct[i + 1].getId());
                listProduct[i].setName(listProduct[i + 1].getName());
                listProduct[i].setPrice(listProduct[i + 1].getPrice());
            } else {
                listProduct[i] = null;
                isNoNull = false;
            }
            if (isNoNull) {
                listProduct[listProduct.length-1] = null;
            }
        }
    }

}
