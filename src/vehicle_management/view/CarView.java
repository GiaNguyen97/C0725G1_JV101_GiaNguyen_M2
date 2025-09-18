package vehicle_management.view;

import vehicle_management.entity.Car;
import vehicle_management.service.CarService;

import java.util.Scanner;

public class CarView {
    private static Scanner scanner = new Scanner(System.in);

    public static void showListCar(Car[] cars) {
        // In tiêu đề bảng
        System.out.printf("%-15s %-20s %-15s %-20s %-15s %-15s%n",
                "Biển số", "Hãng SX", "Năm SX", "Chủ sở hữu", "Số chỗ", "Kiểu xe");
        System.out.println("--------------------------------------------------------------------------------------------------");

        // In dữ liệu xe
        for (Car car : cars) {
            if (car != null) {
                System.out.printf("%-15s %-20s %-15d %-20s %-15d %-15s%n",
                        car.getVehiclePlate(),
                        car.getManufacturerOfVehicle(),
                        car.getManufacturingDateOfVehicle(),
                        car.getVehicleOwner(),
                        car.getNumberOfSeats(),
                        car.getTypeOfCar());
            } else {
                break;
            }
        }
    }


    public static Car inputDataForCar() {
        System.out.println("Thêm mới xe ô tô");
        System.out.print("Nhập biển số xe: ");
        String vehiclePlate = scanner.nextLine();
        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerOfVehicle = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        short manufacturingDateOfVehicle = Short.parseShort(scanner.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String vehicleOwner = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        byte numberOfSeats = Byte.parseByte(scanner.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String typeOfCar = scanner.nextLine();
        Car car = new Car(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, numberOfSeats, typeOfCar);
        return car;
    }
}

