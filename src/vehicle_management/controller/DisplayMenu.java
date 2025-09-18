package vehicle_management.controller;

import vehicle_management.entity.Car;
import vehicle_management.entity.Motorbike;
import vehicle_management.entity.Truck;
import vehicle_management.view.CarView;
import vehicle_management.view.MotobikeView;
import vehicle_management.view.TruckView;
import static vehicle_management.controller.MainMenuVehicleManagerment.truckManager;
import static vehicle_management.controller.MainMenuVehicleManagerment.carManager;
import static vehicle_management.controller.MainMenuVehicleManagerment.motobikeManager;
import java.util.Scanner;

public class DisplayMenu {


    public static void showMenu() {
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
                    Truck[] trucks = truckManager.findAll();
                    TruckView.showListTruck(trucks);
                    break;
                case 2:
                    System.out.println("Danh sách xe ô tô");
                    Car[] cars = carManager.findAll();
                    CarView.showListCar(cars);
                    break;
                case 3:
                    System.out.println("Danh sách xe máy");
                    Motorbike[] motorbikes = motobikeManager.findAll();
                    MotobikeView.showListMotorbike(motorbikes);
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }
}
