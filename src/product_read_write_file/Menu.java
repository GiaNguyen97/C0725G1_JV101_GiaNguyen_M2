package product_read_write_file;

import java.util.List;
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
                    ------Quản lý sản phẩm------
                     1. Hiển thị danh sách
                     2. Thêm sản phẩm
                     3. Sửa thông tin sản phẩm
                     4. Tìm kiếm sản phẩm
                     5. Xóa sản phẩm
                     6. Thoát
                     Lựa chọn chức năng:\s""");

            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1 -> {
                    System.out.println("-------Danh sách sản phẩm------");
                    List <Product> products = productManager.displayAll();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                }
                case 2 -> {
                    System.out.println("-------Thêm mới sản phẩm-------");
                    System.out.print("Nhập id: ");
                    String id = scanner.nextLine();
                    if (!productManager.findIndexByInfor(id, "id").isEmpty()) {
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
                    System.out.println("-------Sửa thông tin sản phẩm-------");
                    System.out.print("Nhập id sản phẩm cần sửa: ");
                    String editId = scanner.nextLine();
                    List<Integer> indexList = productManager.findIndexByInfor(editId, "id");
                    if (indexList.isEmpty()) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + editId);
                        break;
                    }
                    int index = indexList.get(0);
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
                    System.out.println("-------Tìm kiếm sản phẩm-------");
                    System.out.println("1. Tìm theo ID");
                    System.out.println("2. Tìm theo tên");
                    System.out.println("3. Tìm theo giá");
                    System.out.print("Chọn cách tìm: ");
                    int opt = Integer.parseInt(scanner.nextLine());

                    String field = "";
                    Object value = null;

                    switch (opt) {
                        case 1 -> {
                            field = "id";
                            System.out.print("Nhập ID sản phẩm: ");
                            value = scanner.nextLine();
                        }
                        case 2 -> {
                            field = "tên";
                            System.out.print("Nhập tên sản phẩm: ");
                            value = scanner.nextLine();
                        }
                        case 3 -> {
                            field = "giá";
                            System.out.print("Nhập giá sản phẩm: ");
                            value = Integer.parseInt(scanner.nextLine());
                        }
                        default -> System.out.println("Lựa chọn không hợp lệ!");
                    }

                    if (field.isEmpty()) break;

                    List<Integer> indexes = productManager.findIndexByInfor(value, field);
                    if (!indexes.isEmpty()) {
                        System.out.println("Kết quả tìm kiếm:");
                        for (var p : productManager.find(indexes)) {
                            System.out.println(p);
                        }
                    } else {
                        System.out.println("Không tìm thấy sản phẩm!");
                    }
                }

                case 5 -> {
                    System.out.print("Nhập id cần xóa: ");
                    String idDelete = scanner.nextLine();
                    List<Integer> indexes = productManager.findIndexByInfor(idDelete, "id");
                    if (indexes.isEmpty()) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + idDelete);
                        break;
                    }
                    System.out.println("Xác nhận xóa sản phẩm: ");
                    for (var p : productManager.find(indexes)) {
                        System.out.println(p);
                    }
                    System.out.print("1. Có / 2. Không: ");
                    if (Integer.parseInt(scanner.nextLine()) == 1) {
                        productManager.delete(indexes);
                        System.out.println("Đã xóa sản phẩm thành công");
                    }
                }
                case 6 -> isRun = false;
                default -> System.out.println("Chức năng không hợp lệ!");
            }
        }
    }
}
