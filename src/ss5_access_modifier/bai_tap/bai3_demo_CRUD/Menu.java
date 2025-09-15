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
                    
                     3. Sửa thông tin sản phẩm\
                     
                     4. Tìm kiếm sản phẩm\
                    
                     5. Xóa sản phẩm\
                    
                     6. Thoát\
                    
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

                    boolean exist = false;
                    for (byte i = 0; i < productManage.listProduct.length; i++) {
                        if (productManage.listProduct[i] != null &&
                                productManage.listProduct[i].getId().equals(id)) {
                            exist = true;
                            break;
                        }
                    }

                    if (exist) {
                        System.out.println("ID đã tồn tại, vui lòng nhập lại!");
                    } else {
                        System.out.print("Nhập tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập giá: ");
                        int price = Integer.parseInt(scanner.nextLine());
                        productManage.add(id, name, price);
                        System.out.println("Đã thêm sản phẩm thành công!");
                    }
                    break;

                case 3:
                    System.out.println("Sửa thông tin sản phẩm");
                    System.out.print("Nhập id sản phẩm cần sửa thông tin: ");
                    String editId = scanner.nextLine();
                    boolean foundEdit = false;
                    for (byte i = 0; i < productManage.listProduct.length; i++) {
                        if (productManage.listProduct[i] != null &&
                                productManage.listProduct[i].getId().equals(editId)) {

                            System.out.println(productManage.listProduct[i]);
                            System.out.print("Nhập tên sửa :");
                            String editName = scanner.nextLine();
                            System.out.print("Nhập giá sửa :");
                            int editPrice = Integer.parseInt(scanner.nextLine());
                            System.out.println("Xác nhận sửa thông tin sản phẩm");
                            System.out.print("từ" + productManage.listProduct[i]);
                            System.out.println(" thành Product{ id =" + editId + ", tên= " + editName + ", giá= " + editPrice + "}");
                            System.out.println("\n1.Có\n2.Không\n---------------");
                            byte comfirmEdit = Byte.parseByte(scanner.nextLine());
                            if (comfirmEdit == 1) {
                                productManage.edit(i, editName, editPrice);
                                foundEdit = true;
                                System.out.println("Đã sửa thông tin sản phẩm thành công");
                            }
                            break;
                        }
                    }
                    if (!foundEdit) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + editId);
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm sản phẩm");
                    System.out.print("Nhập id sản phẩm cần tìm: ");
                    String findId = scanner.nextLine();
                    boolean foundFind = false;
                    for (byte i = 0; i < productManage.listProduct.length; i++) {
                        if (productManage.listProduct[i] != null &&
                                productManage.listProduct[i].getId().equals(findId)) {
                                productManage.find(i);
                                foundFind = true;
                            break;
                        }
                    }
                    if (!foundFind) {
                        System.out.println("Không tìm thấy sản phẩm với id: " + findId);
                    }
                    break;
                case 5:
                    System.out.println("Xóa sản phẩm");
                    System.out.print("Nhập id cần xóa: ");
                    String idDelete = scanner.nextLine();
                    boolean foundDelte = false;
                    System.out.println("Xác nhận xóa sản phẩm này");
                    for (byte i = 0; i < productManage.listProduct.length; i++) {
                        if (productManage.listProduct[i] != null &&
                                productManage.listProduct[i].getId().equals(idDelete)) {
                            System.out.println(productManage.listProduct[i]);
                            System.out.println("1. Có\n2.Không\n---------------");
                            byte confirmDelete = Byte.parseByte(scanner.nextLine());
                            if (confirmDelete == 1) {
                                productManage.delete(i);
                                System.out.println("Đã xóa sản phẩm thành công");
                                foundDelte = true;
                            }
                            break;
                        }
                    }
                    if (!foundDelte) {
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
