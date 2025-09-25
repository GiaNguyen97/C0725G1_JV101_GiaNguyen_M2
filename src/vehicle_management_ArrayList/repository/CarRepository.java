package vehicle_management_ArrayList.repository;

import vehicle_management_ArrayList.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRepository implements ICarRepository {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("43A-212.56", "Toyota", (short) 2019, "Nguyễn Văn A", (byte) 5, "Du lịch"));
        cars.add(new Car("43B-453.88", "Huyndai", (short) 2020, "Nguyễn Văn B", (byte) 45, "Xe khách"));
        cars.add(new Car("43B-453.89", "Ford", (short) 2020, "Nguyễn Văn C", (byte) 16, "Xe khách"));
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên hãng sản xuất: ");
        String manufacturerOfVehicle = scanner.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        short manufacturingDateOfVehicle = Short.parseShort(scanner.nextLine());
        System.out.print("Nhập tên chủ sở hữu: ");
        String vehicleOwner = scanner.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        byte numberOfSeats = Byte.parseByte(scanner.nextLine());
        String typeOfCar = (vehiclePlate.charAt(2) == 'A') ? "Du lịch" : "Xe khách";

        for (Car car : cars) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Sửa " + car + " thành "
                        + new Car(vehiclePlate, manufacturerOfVehicle, manufacturingDateOfVehicle,
                        vehicleOwner, numberOfSeats, typeOfCar));
                if (confirm()) {
                    car.setManufacturerOfVehicle(manufacturerOfVehicle);
                    car.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                    car.setVehicleOwner(vehicleOwner);
                    car.setNumberOfSeats(numberOfSeats);
                    car.setTypeOfCar(typeOfCar);
                    System.out.println("Đã sửa thành công!");
                }
                break;
            }
        }
    }

    @Override
    public Car findByVehiclePlate(String vehiclePlate) {
        for (Car car : cars) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        if (vehiclePlate == null) {
            return false;
        }
        for (Car car : cars) {
            if (vehiclePlate.equals(car.getVehiclePlate())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Xóa " + cars.get(i));
                if (confirm()) {
                    cars.remove(i);
                    System.out.println("Đã xóa thành công!");
                }
                break;
            }
        }
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    public boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xác nhận thực hiện thao tác này: 1.Có 2.Không");
        byte choice = Byte.parseByte(scanner.nextLine());
        return choice == 1;
    }
}
