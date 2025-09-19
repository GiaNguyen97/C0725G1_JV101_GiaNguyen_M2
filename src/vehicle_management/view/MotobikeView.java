package vehicle_management.view;


import vehicle_management.entity.Motorbike;

import java.util.Scanner;
import java.util.regex.Pattern;

import static vehicle_management.controller.VehicleController.*;

public class MotobikeView {
    private static final Scanner scanner = new Scanner(System.in);

    public static void showListMotorbike(Motorbike[] motorbikes) {
        // In tiêu đề
        System.out.printf("%-15s %-20s %-8s %-20s %-12s%n",
                "Biển số", "Hãng SX", "Năm", "Chủ sở hữu", "Công suất");

        System.out.println("--------------------------------------------------------------------------------");

        // In dữ liệu
        for (Motorbike motorbike : motorbikes) {
            if (motorbike != null) {
                System.out.printf("%-15s %-20s %-8d %-20s %-12d%n",
                        motorbike.getVehiclePlate(),
                        motorbike.getManufacturerOfVehicle(),
                        motorbike.getManufacturingDateOfVehicle(),
                        motorbike.getVehicleOwner(),
                        motorbike.getEnginePowerofMotobike());
            } else {
                break;
            }
        }
    }

    public static Motorbike inputDataForMotorbike() {
        System.out.println("Thêm mới xe máy");
        String vehiclePlate;
        while (true) {
            System.out.print("Nhập biển số xe: ");
            vehiclePlate = scanner.nextLine();

            if (!Pattern.matches(MOTORBIKE_REGEX, vehiclePlate)) {
                System.out.println("Sai định dạng!");
                System.out.println("Đúng định dạng: XX-YZ-XXX.XX (X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa)");
                if (!askRetry()) {
                    return null;
                }
                continue;
            }

            if (motobikeManager.checkVehiclePlate(vehiclePlate)) {
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
        System.out.print("Nhập công suất: ");
        short enginePowerofMotobike = Short.parseShort(scanner.nextLine());
        return new Motorbike(vehiclePlate,manufacturerOfVehicle,manufacturingDateOfVehicle,vehicleOwner,enginePowerofMotobike);
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
