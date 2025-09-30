package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.view;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.entity.Product;
import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.service.ProductService;

import java.util.List;
import java.util.Scanner;

import static ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.controller.ProductController.productServicer;

public class ProductView {
    private final Scanner scanner = new Scanner(System.in);

    public void displayAll() {
        List<Product> products = productServicer.findAll();
        if (!products.isEmpty()) {
            for (Product product : products) {
                System.out.println(product);
            }
        } else {
            System.out.println("File đang trống");
        }
    }


    public void inputData(byte choose) {
        switch (choose) {
            case 2 -> {
                do {
                    System.out.print("Nhập mã sản phẩm: ");
                    String id = scanner.nextLine();
                    if (productServicer.findById(id) != -1) {
                        System.out.println("Mã sản phẩm đã tồn tại, vui lòng nhập lại");
                    } else {
                        Product product = new Product();
                        product.setId(id);
                        inputDataNotDuplicate(product);
                        if (productServicer.add(product)) {
                            System.out.println("Thêm mới sản phẩm thành công");
                        } else {
                            System.out.println("Thêm mới sản phẩm thất bại");
                        }
                        break;
                    }
                } while (true);
            }
            case 4 -> {
            }
        }

    }

    public void inputDataNotDuplicate(Product product) {
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập hảng sản xuất: ");
        String manufacturer = scanner.nextLine();
        System.out.print("Mô tả sản phẩm :");
        String inforProduct = scanner.nextLine();
        product.setInforNotDuplicate(name, price, manufacturer, inforProduct);
    }

    public void findProduct() {
        System.out.print("Nhập mã sản phẩm cần tìm: ");
        String id = scanner.nextLine();
        if (productServicer.findById(id) != -1) {
            System.out.println(productServicer.find(productServicer.findById(id)));
        } else {
            System.out.println("Mã sản phẩm không tồn tại trên hệ thống");
        }
    }
}