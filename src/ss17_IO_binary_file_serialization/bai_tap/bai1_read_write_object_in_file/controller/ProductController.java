package ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.controller;

import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.service.ProductService;
import ss17_IO_binary_file_serialization.bai_tap.bai1_read_write_object_in_file.view.ProductView;

import java.util.Scanner;

public class ProductController {
    private static final ProductView productView = new ProductView();
    public static final ProductService productServicer = new ProductService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {

            System.out.print("""
                    -----Quản lý sản phẩm------
                    1. Hiển thị danh sách
                    2. Thêm sản phẩm
                    3. Tìm sản phảm
                    4. Thoát
                    Chọn chức năng:\s""");
            byte choose = Byte.parseByte(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    System.out.println("---Danh sách sản phẩm---");
                    productView.displayAll();
                }
                case 2 -> {
                    System.out.println("---Thêm mới sản phẩm---");
                    productView.inputData(choose);
                }
                case 3 -> {
                    System.out.println("---Tìm kiếm sản phẩm---");
                    productView.findProduct();
                }
                case 4 -> {
                    System.out.println("Hẹn gặp lại!!!");
                    flag = false;
                }
                default -> System.out.println("Vui lòng chọn đúng chức năng");
            }
        }

    }

}
