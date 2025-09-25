package vehicle_management_TextFile.repository;

import vehicle_management_TextFile.entity.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarRepository implements ICarRepository {
    private static final String FILE_PATH = "E:\\CODEGYM\\bai_tap_code_gym\\module_2\\untitled\\src\\vehicle_management_TextFile\\list_car.csv";

    @Override
    public List<Car> findAll() {
        return readFileList(FILE_PATH);
    }

    @Override
    public void add(Car car) {
        List<Car> cars = readFileList(FILE_PATH);
        cars.add(car);
        writeFileList(FILE_PATH, cars);
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        List<Car> cars = readFileList(FILE_PATH);
        for (Car car : cars) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập tên hãng sản xuất: ");
                String manufacturer = scanner.nextLine();
                System.out.print("Nhập năm sản xuất: ");
                short year = Short.parseShort(scanner.nextLine());
                System.out.print("Nhập tên chủ sở hữu: ");
                String owner = scanner.nextLine();
                System.out.print("Nhập số chỗ ngồi: ");
                byte seats = Byte.parseByte(scanner.nextLine());

                String type = (vehiclePlate.charAt(2) == 'A') ? "Du lịch" : "Xe khách";

                System.out.println("Sửa " + car + " thành " +
                        new Car(vehiclePlate, manufacturer, year, owner, seats, type));

                if (confirm()) {
                    car.setManufacturerOfVehicle(manufacturer);
                    car.setManufacturingDateOfVehicle(year);
                    car.setVehicleOwner(owner);
                    car.setNumberOfSeats(seats);
                    car.setTypeOfCar(type);
                    System.out.println("Đã sửa thành công!");
                    writeFileList(FILE_PATH, cars);
                } else {
                    System.out.println("Đã hủy thao tác!");
                }
                break;
            }
        }
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
        List<Car> cars = readFileList(FILE_PATH);
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getVehiclePlate().equals(vehiclePlate)) {
                System.out.println("Xóa " + cars.get(i));
                if (confirm()) {
                    cars.remove(i);
                    System.out.println("Đã xóa thành công!");
                    writeFileList(FILE_PATH, cars);
                } else {
                    System.out.println("Đã hủy thao tác!");
                }
                break;
            }
        }
    }


    @Override
    public Car findByVehiclePlate(String vehiclePlate) {
        for (Car car : readFileList(FILE_PATH)) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        for (Car car : readFileList(FILE_PATH)) {
            if (car.getVehiclePlate().equals(vehiclePlate)) {
                return true;
            }
        }
        return false;
    }

    private List<Car> readFileList(String filePath) {
        List<Car> cars = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                Car car = new Car(
                        data[0],                       // biển số
                        data[1],                       // hãng sx
                        Short.parseShort(data[2]),     // năm sx
                        data[3],                       // chủ sở hữu
                        Byte.parseByte(data[4]),       // số chỗ ngồi
                        data[5]                        // loại xe
                );
                cars.add(car);
            }
        } catch (IOException e) {
            System.err.println("Lỗi đọc file: " + e.getMessage());
        }
        return cars;
    }

    private void writeFileList(String filePath, List<Car> cars) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            for (Car car : cars) {
                bufferedWriter.write(car.getVehiclePlate() + "," +
                        car.getManufacturerOfVehicle() + "," +
                        car.getManufacturingDateOfVehicle() + "," +
                        car.getVehicleOwner() + "," +
                        car.getNumberOfSeats() + "," +
                        car.getTypeOfCar());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    public boolean confirm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xác nhận thao tác này? 1.Có  2.Không");
        byte choice = Byte.parseByte(scanner.nextLine());
        return choice == 1;
    }
}
