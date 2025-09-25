package vehicle_management_ArrayList.service.vehicle_management_ArrayList.view;

import vehicle_management_ArrayList.service.vehicle_management_ArrayList.entity.Car;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import static vehicle_management_Array.controller.VehicleController.CAR_REGEX;
import static vehicle_management_Array.controller.VehicleController.carManager;
public class CarView {
    private static final Scanner scanner = new Scanner(System.in);


    public static void showListCar(List<Car> cars) {
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
        String vehiclePlate;
        while (true) {
            System.out.print("Nhập biển số xe: ");
            vehiclePlate = scanner.nextLine();

            if (!Pattern.matches(CAR_REGEX, vehiclePlate)) {
                System.out.println("Sai định dạng!");
                System.out.println("Đúng định dạng: XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B nếu xe khách)");
                if (!askRetry()) {
                    return null;
                }
                continue;
            }

            if (carManager.checkVehiclePlate(vehiclePlate)) {
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
        System.out.print("Nhập số chỗ ngồi: ");
        byte numberOfSeats = Byte.parseByte(scanner.nextLine());
        String typeOfCar;
        if (vehiclePlate.charAt(2) == 'A') {
            typeOfCar = "Du lịch";
        } else {
            typeOfCar = "Xe khách";
        }
        return new Car(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle, vehicleOwner, numberOfSeats, typeOfCar);
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

