package vehicle_management.view;


import vehicle_management.entity.Truck;

import java.util.Scanner;

public class TruckView {
    private static Scanner scanner = new Scanner(System.in);

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
        System.out.print("Nhập biển số xe: ");
        String vehiclePlate = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerOfVehicle = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        short manufacturingDateOfVehicle = Short.parseShort(scanner.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String vehicleOwner = scanner.nextLine();
        System.out.print("Nhập kiểu xe: ");
        short grossTruckWeight = Short.parseShort(scanner.nextLine());
        Truck truck = new Truck(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, grossTruckWeight);
        return truck;
    }
}
