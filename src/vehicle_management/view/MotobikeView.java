package vehicle_management.view;


import vehicle_management.entity.Motorbike;

import java.util.Scanner;

public class MotobikeView {
    private static Scanner scanner = new Scanner(System.in);

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
        System.out.println("Thêm mới xe ô tô");
        System.out.print("Nhập biển số xe: ");
        String vehiclePlate = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerOfVehicle = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        short manufacturingDateOfVehicle = Short.parseShort(scanner.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String vehicleOwner = scanner.nextLine();
        System.out.print("Nhập kiểu xe: ");
        short enginePowerofMotobike = Short.parseShort(scanner.nextLine());
        Motorbike motorbike = new Motorbike(vehiclePlate,manufacturerOfVehicle,manufacturingDateOfVehicle,vehicleOwner,enginePowerofMotobike);
        return motorbike;
    }
}
