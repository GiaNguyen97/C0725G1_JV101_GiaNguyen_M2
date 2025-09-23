package ss12_Map_Tree.bai_tap.product_manager.linkedlist;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean isRun = true;

        while (isRun) {
            System.out.print("""
                    ---Quản lý sản phẩm---
                     1. Hiển thị danh sách
                     2. Thêm sản phẩm
                     3. Sửa thông tin sản phẩm
                     4. Tìm kiếm sản phẩm
                     5. Xóa sản phẩm
                     6. Thoát
                     Lựa chọn chức năng: """);

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1 -> {
                    System.out.println("Danh sách sản phẩm:");
                    productManager.displayAll();
                }
                case 2 -> {
                    System.out.print("Nhập id: ");
                    String id = scanner.nextLine();
                    if (productManager.findIndexById(id) != -1) {
                        System.out.println("ID đã tồn tại, vui lòng nhập lại!");
                        break;
                    }
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    productManager.add(id, name, price);
                    System.out.println("Đã thêm sản phẩm thành công!");
                }
                case 3 -> {
                    System.out.print("Nhập id sản phẩm cần sửa: ");
                    String editId = scanner.nextLine();
                    int index = productManager.findIndexById(editId);
                    if (index == -1) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + editId);
                        break;
                    }
                    System.out.println("Sản phẩm hiện tại: " + productManager.find(index));
                    System.out.print("Nhập tên mới: ");
                    String editName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    int editPrice = Integer.parseInt(scanner.nextLine());
                    System.out.print("Xác nhận sửa (1.Có / 2.Không): ");
                    if (Integer.parseInt(scanner.nextLine()) == 1) {
                        productManager.edit(index, editName, editPrice);
                        System.out.println("Đã sửa thông tin sản phẩm thành công");
                    }
                }
                case 4 -> {
                    System.out.print("Nhập id sản phẩm cần tìm: ");
                    String findId = scanner.nextLine();
                    int index = productManager.findIndexById(findId);
                    if (index != -1) {
                        System.out.println(productManager.find(index));
                    } else {
                        System.out.println("Không tìm thấy sản phẩm với id: " + findId);
                    }
                }
                case 5 -> {
                    System.out.print("Nhập id cần xóa: ");
                    String idDelete = scanner.nextLine();
                    int index = productManager.findIndexById(idDelete);
                    if (index == -1) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + idDelete);
                        break;
                    }
                    System.out.println("Xác nhận xóa sản phẩm: " + productManager.find(index));
                    System.out.print("1. Có / 2. Không: ");
                    if (Integer.parseInt(scanner.nextLine()) == 1) {
                        productManager.delete(index);
                        System.out.println("Đã xóa sản phẩm thành công");
                    }
                }
                case 6 -> isRun = false;
                default -> System.out.println("Chức năng không hợp lệ!");
            }
        }
    }
}
