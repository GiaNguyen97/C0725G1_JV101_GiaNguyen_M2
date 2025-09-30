package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity;

import java.io.Serializable;

public class Product  implements Serializable {
    private String id;
    private String name;
    private int price;
    private String manufacturer;
    private String inforProduct;

    public Product() {
    }

    public Product(String id, String name, int price, String manufacturer, String inforProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.inforProduct = inforProduct;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getInforProduct() {
        return inforProduct;
    }

    public void setInforProduct(String inforProduct) {
        this.inforProduct = inforProduct;
    }

    public void setInforNotDuplicate(String name, int price, String manufacturer, String inforProduct) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.inforProduct = inforProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", manufacturer=" + manufacturer +
                ", inforProduct=" + inforProduct +
                '}';
    }
}
