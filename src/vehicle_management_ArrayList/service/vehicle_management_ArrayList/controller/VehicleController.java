package vehicle_management_ArrayList.service.vehicle_management_ArrayList.controller;

import vehicle_management_ArrayList.service.vehicle_management_ArrayList.entity.Car;
import vehicle_management_ArrayList.service.vehicle_management_ArrayList.entity.Motorbike;
import vehicle_management_ArrayList.service.vehicle_management_ArrayList.entity.Truck;
import vehicle_management_ArrayList.service.vehicle_management_ArrayList.service.*;
import vehicle_management_ArrayList.service.vehicle_management_ArrayList.view.CarView;
import vehicle_management_ArrayList.service.vehicle_management_ArrayList.view.MotobikeView;
import vehicle_management_ArrayList.service.vehicle_management_ArrayList.view.TruckView;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class VehicleController {
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
                    addMenu();
                    break;
                case 2:
                    displayMenu();
                    break;
                case 3:
                    System.out.println("Sửa thông tin phương tiện");
                    System.out.print("Nhập biển số xe cần sửa: ");
                    String vehiclePlateEdit = scanner.nextLine();
                    if (Pattern.matches(TRUCK_REGEX, vehiclePlateEdit) && truckManager.checkVehiclePlate(vehiclePlateEdit)) {
                        truckManager.editByVehiclePlate(vehiclePlateEdit);
                    } else if (Pattern.matches(CAR_REGEX, vehiclePlateEdit) && carManager.checkVehiclePlate(vehiclePlateEdit)) {
                        carManager.editByVehiclePlate(vehiclePlateEdit);
                    } else if (Pattern.matches(MOTORBIKE_REGEX, vehiclePlateEdit) && motobikeManager.checkVehiclePlate(vehiclePlateEdit)) {
                        motobikeManager.editByVehiclePlate(vehiclePlateEdit);
                    } else {
                        System.out.println("Biển số " + vehiclePlateEdit + " không có trên hệ thống.");
                    }
                    break;
                case 4:
                    System.out.println("Tìm kiếm phương tiện");
                    System.out.print("Nhập biển số xe cần tìm: ");
                    String vehiclePlateFind = scanner.nextLine();
                    if (Pattern.matches(TRUCK_REGEX, vehiclePlateFind) && truckManager.checkVehiclePlate(vehiclePlateFind)) {
                        System.out.println(truckManager.findByVehiclePlate(vehiclePlateFind));
                    } else if (Pattern.matches(CAR_REGEX, vehiclePlateFind) && carManager.checkVehiclePlate(vehiclePlateFind)) {
                        System.out.println(carManager.findByVehiclePlate(vehiclePlateFind));
                    } else if (Pattern.matches(MOTORBIKE_REGEX, vehiclePlateFind) && motobikeManager.checkVehiclePlate(vehiclePlateFind)) {
                        System.out.println(motobikeManager.findByVehiclePlate(vehiclePlateFind));
                    } else {
                        System.out.println("Biển số " + vehiclePlateFind + " không có trên hệ thống.");
                    }
                    break;
                case 5:
                    System.out.println("Xóa phương tiện");
                    System.out.print("Nhập biển số xe cần xóa: ");
                    String vehiclePlateDelete = scanner.nextLine();
                    if (Pattern.matches(TRUCK_REGEX, vehiclePlateDelete) && truckManager.checkVehiclePlate(vehiclePlateDelete)) {
                        truckManager.deleteByVehiclePlate(vehiclePlateDelete);
                    } else if (Pattern.matches(CAR_REGEX, vehiclePlateDelete) && carManager.checkVehiclePlate(vehiclePlateDelete)) {
                        carManager.deleteByVehiclePlate(vehiclePlateDelete);
                    } else if (Pattern.matches(MOTORBIKE_REGEX, vehiclePlateDelete) && motobikeManager.checkVehiclePlate(vehiclePlateDelete)) {
                        motobikeManager.deleteByVehiclePlate(vehiclePlateDelete);
                    } else {
                        System.out.println("Biển số " + vehiclePlateDelete + " không có trên hệ thống.");
                    }
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
    private static void addMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=== Thêm mới phương tiện ===" +
                    "\n 1. Thêm xe tải" +
                    "\n 2. Thêm ôtô" +
                    "\n 3. Thêm xe máy" +
                    "\n 4. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    Truck truck = TruckView.inputDataForTruck();
                    truckManager.add(truck);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    Car car = CarView.inputDataForCar();
                    carManager.add(car);
                    System.out.println("Thêm mới thành công");
                    break;
                case 3:
                    Motorbike motobike = MotobikeView.inputDataForMotorbike();
                    motobikeManager.add(motobike);
                    System.out.println("Thêm mới thành công");
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
    private static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("=== Hiển thị phương tiện ===" +
                    "\n 1. Hiển thị xe tải" +
                    "\n 2. Hiển thị ôtô" +
                    "\n 3. Hiển thị xe máy" +
                    "\n 4. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Danh sách xe tải");
                    List<Truck> trucks = truckManager.findAll();
                    TruckView.showListTruck(trucks);
                    break;
                case 2:
                    System.out.println("Danh sách xe ô tô");
                    List<Car> cars = carManager.findAll();
                    CarView.showListCar(cars);
                    break;
                case 3:
                    System.out.println("Danh sách xe máy");
                    List<Motorbike> motorbikes = motobikeManager.findAll();
                    MotobikeView.showListMotorbike(motorbikes);
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
}
