package vehicle_management.controller;

import java.util.Scanner;

public class MainMenuVehicleManagerment {
    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=== QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG ===" +
                    "\n 1. Thêm mới phương tiện" +
                    "\n 2. Hiện thị phương tiện" +
                    "\n 3. Sửa thông tin phương tiện" +
                    "\n 4. Tìm kiếm phương tiện" +
                    "\n 5. Xóa phương tiện" +
                    "\n 6. Thoát");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    AddMenu.showMenu();
                    break;
                case 2:
                    DisplayMenu.showMenu();
                    break;
                case 3:
                    System.out.println("Sửa thông tin phương tiện");
                    System.out.print("Nhập biển số xe cần sửa");
                    break;
                case 4:
                    System.out.println("Chức năng đang mở rộng");
                    break;
                case 5:
                    System.out.println("Chức năng đang mở rộng");
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }

}
