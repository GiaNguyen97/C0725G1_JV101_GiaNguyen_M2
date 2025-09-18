package vehicle_management.repository;

import vehicle_management.entity.Car;

public class CarRepository implements ICarRepository {
    private static Car[] cars = new Car[100];

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
    public void edit(String vehiclePlate) {

    }

    @Override
    public void find(String vehiclePlate) {

    }

    @Override
    public boolean deleteByVehiclePlate(String vehiclePlate) {
        return false;
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
