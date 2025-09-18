package vehicle_management.view;


import vehicle_management.entity.Truck;

import java.util.Scanner;
import java.util.regex.Pattern;

import static vehicle_management.controller.MainMenuVehicleManagerment.*;

public class TruckView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showListTruck(Truck[] trucks) {

        // In tiêu đề
        System.out.printf("%-15s %-20s %-8s %-20s %-12s%n",
                "Biển số", "Hãng SX", "Năm", "Chủ sở hữu", "Tải trọng");

        System.out.println("--------------------------------------------------------------------------------");

        // In dữ liệu
        for (Truck truck : trucks) {
            if (truck != null) {
                System.out.printf("%-15s %-20s %-8d %-20s %-12d%n",
                        truck.getVehiclePlate(),
                        truck.getManufacturerOfVehicle(),
                        truck.getManufacturingDateOfVehicle(),
                        truck.getVehicleOwner(),
                        truck.getGrossTruckWeight());
            } else {
                break;
            }
        }
    }

    public static Truck inputDataForTruck() {
        System.out.println("Thêm mới xe ô tô");
        String vehiclePlate;
        while (true) {
            System.out.print("Nhập biển số xe: ");
            vehiclePlate = scanner.nextLine();

            if (!Pattern.matches(TRUCK_REGEX, vehiclePlate)) {
                System.out.println("Sai định dạng!");
                System.out.println("Đúng định dạng: XXC-XXX.XX (X : 0÷9)");
                if (!askRetry()) {
                    return null;
                }
                continue;
            }

            if (truckManager.checkVehiclePlate(vehiclePlate)) {
                System.out.println("Biển số xe này đã tồn tại!");
                if (!askRetry()) {
                    return null;
                }
                continue;
            }
            break;
        }
        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerOfVehicle = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        short manufacturingDateOfVehicle = Short.parseShort(scanner.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String vehicleOwner = scanner.nextLine();
        System.out.print("Nhập kiểu xe: ");
        short grossTruckWeight = Short.parseShort(scanner.nextLine());
        return new Truck(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, grossTruckWeight);
    }
    private static boolean askRetry() {
        while (true) {
            System.out.print("Bạn có muốn nhập lại không? (1. Nhập lại | 2. Thoát): ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                return true;
            } else if (choice.equals("2")) {
                return false;
            } else {
                System.out.println("Vui lòng chọn 1 hoặc 2!");
            }
        }
    }
}
