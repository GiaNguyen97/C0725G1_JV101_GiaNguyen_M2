package vehicle_management.controller;

import vehicle_management.entity.Car;
import vehicle_management.entity.Motorbike;
import vehicle_management.entity.Truck;
import vehicle_management.service.*;
import vehicle_management.view.CarView;
import vehicle_management.view.MotobikeView;
import vehicle_management.view.TruckView;

import java.util.Scanner;


public class AddMenu {
    private static ICarService carManager = new CarService();
    private static ITruckService truckManager = new TruckService();
    private static IMotobikeService motobikeManager = new MotobikeService();

    public static void showMenu() {
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
}
