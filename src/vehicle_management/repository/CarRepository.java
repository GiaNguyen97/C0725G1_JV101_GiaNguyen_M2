package vehicle_management.repository;

import vehicle_management.entity.Car;

import java.util.Scanner;

public class CarRepository implements ICarRepository {
    private static final Car[] cars = new Car[100];

    static {
        cars[0] = new Car("43A-212.56", "Toyota", (short) 2019, "Nguyễn Văn A", (byte) 5, "Du lịch");
        cars[1] = new Car("43B-453.88", "Huyndai", (short) 2020, "Nguyễn Văn B", (byte) 45, "Xe khách");
        cars[2] = new Car("43B-453.89", "Ford", (short) 2020, "Nguyễn Văn C", (byte) 16, "Xe khách");
    }

    @Override
    public Car[] findAll() {
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
        String typeOfCar;
        if (vehiclePlate.charAt(2) == 'A') {
            typeOfCar = "Du lịch";
        } else {
            typeOfCar = "Xe khách";
        }

        for (Car car : cars) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                car.setManufacturerOfVehicle(manufacturerOfVehicle);
                car.setManufacturingDateOfVehicle(manufacturingDateOfVehicle);
                car.setVehicleOwner(vehicleOwner);
                car.setNumberOfSeats(numberOfSeats);
                car.setTypeOfCar(typeOfCar);
                break;
            }
        }

    }

    @Override
    public Car findByVehiclePlate(String vehiclePlate) {
        byte i;
        for (i = 0; i < cars.length; i++) {
            if (cars[i].getVehiclePlate().equals(vehiclePlate)) {
                break;
            }
        }
        return cars[i];
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        boolean ischeckVehiclePlate = false;
        for (Car car : cars) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                ischeckVehiclePlate = true;
                break;
            }
        }
        return ischeckVehiclePlate;
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        for (byte i=0; i<cars.length; i++) {
            if (cars[i].getVehiclePlate().equals(vehiclePlate)) {
                for (byte j = i; j<cars.length; j++){
                    boolean isNoNull = true;
                    if (cars[i+1]!=null) {
                        cars[i].setManufacturerOfVehicle(cars[i+1].getManufacturerOfVehicle());
                        cars[i].setTypeOfCar(cars[i+1].getTypeOfCar());
                        cars[i].setVehicleOwner(cars[i+1].getVehicleOwner());
                        cars[i].setNumberOfSeats(cars[i+1].getNumberOfSeats());
                        cars[i].setManufacturerOfVehicle(cars[i+1].getManufacturerOfVehicle());
                    } else {
                        cars[i] = null;
                        isNoNull = false;
                    }
                    if (isNoNull) {
                        cars[cars.length-1] = null;
                    }
                }
                break;
            }
        }
    }

    @Override
    public void add(Car car) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null) {
                cars[i] = car;
                break;
            }
        }

    }

}
