package vehicle_management.controller;

import vehicle_management.service.*;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MainMenuVehicleManagerment {
    public static final String TRUCK_REGEX = "^\\d{2}C-\\d{3}\\.\\d{2}$";
    public static final String CAR_REGEX = "^\\d{2}[AB]-\\d{3}\\.\\d{2}$";
    public static final String MOTORBIKE_REGEX = "^\\d{2}-[A-Z][A-Z0-9]-\\d{3}\\.\\d{2}$";
    public static ICarService carManager = new CarService();
    public static ITruckService truckManager = new TruckService();
    public static IMotobikeService motobikeManager = new MotobikeService();

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
                    System.out.print("Nhập biển số xe cần sửa: ");
                    String vehiclePlateEdit = scanner.nextLine();
                    if (Pattern.matches(TRUCK_REGEX, vehiclePlateEdit)) {
                        truckManager.editByVehiclePlate(vehiclePlateEdit);
                    } else if (Pattern.matches(CAR_REGEX, vehiclePlateEdit)) {
                        carManager.editByVehiclePlate(vehiclePlateEdit);
                    } else if (Pattern.matches(MOTORBIKE_REGEX, vehiclePlateEdit)) {
                        motobikeManager.editByVehiclePlate(vehiclePlateEdit);
                    } else {
                        System.out.println("Biển số " + vehiclePlateEdit + " sai định dạng hệ thống.");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm phương tiện");
                    System.out.print("Nhập biển số xe cần tìm: ");
                    String vehiclePlateFind = scanner.nextLine();
                    if (Pattern.matches(TRUCK_REGEX, vehiclePlateFind)) {
                        truckManager.editByVehiclePlate(vehiclePlateFind);
                    } else if (Pattern.matches(CAR_REGEX, vehiclePlateFind)) {
                        carManager.editByVehiclePlate(vehiclePlateFind);
                    } else if (Pattern.matches(MOTORBIKE_REGEX, vehiclePlateFind)) {
                        motobikeManager.editByVehiclePlate(vehiclePlateFind);
                    } else {
                        System.out.println("Biển số " + vehiclePlateFind + " sai định dạng hệ thống.");
                    }
                    break;
                case 5:
                    System.out.println("Xóa phương tiện");
                    System.out.print("Nhập biển số xe cần xóa: ");
                    String vehiclePlateDelete = scanner.nextLine();
                    if (Pattern.matches(TRUCK_REGEX, vehiclePlateDelete)) {
                        truckManager.editByVehiclePlate(vehiclePlateDelete);
                    } else if (Pattern.matches(CAR_REGEX, vehiclePlateDelete)) {
                        carManager.editByVehiclePlate(vehiclePlateDelete);
                    } else if (Pattern.matches(MOTORBIKE_REGEX, vehiclePlateDelete)) {
                        motobikeManager.editByVehiclePlate(vehiclePlateDelete);
                    } else {
                        System.out.println("Biển số " + vehiclePlateDelete + " sai định dạng hệ thống.");
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }

}
