package ss5_access_modifier.bai_tap.bai3_demo_CRUD;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        ProductManage productManage = new ProductManage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("""                    
                    ---Quản lý sản phẩm---\
                    
                     1. Hiển thị danh sách\
                    
                     2. Thêm sản phẩm\
                    
                     3. Xóa sản phẩm\
                    
                     4. Thoát\
                    
                     ----Lựa chọn chức năng---""");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách sản phẩm");
                    for (byte i = 0; i < productManage.listProduct.length; i++) {
                        if (productManage.listProduct[i] != null) {
                            System.out.println(productManage.listProduct[i]);
                        } else {
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm");
                    System.out.print("Nhập id: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    productManage.add(id, name, price);
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm");
                    System.out.print("Nhập id cần xóa: ");
                    String idDelete = scanner.nextLine();
                    boolean found = false;

                    for (byte i = 0; i < productManage.listProduct.length; i++) {
                        if (productManage.listProduct[i] != null &&
                                productManage.listProduct[i].getId().equals(idDelete)) {

                            productManage.delete(i);
                            System.out.println("Đã xóa sản phẩm có id: " + idDelete);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + idDelete);
                    }
                    break;

                default:
                    isRun = false;
                    break;

            }
        }
    }
}
