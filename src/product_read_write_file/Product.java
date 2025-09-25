package product_read_write_file;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;


public class Product {
    private String id;
    private String name;
    private int price;

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeVN);
        currencyFormatter.setCurrency(Currency.getInstance("VND"));


        return "Product{" +
                "id= " + id +
                ", tên= " + name +
                ", giá= " + currencyFormatter.format(price) +
                '}';
    }

    public String getInfoToSCV() {
        return this.getId()+","+this.getName()+","+this.getPrice();
    }
}
