package vehicle_management.service;

import vehicle_management.entity.Car;
import vehicle_management.repository.CarRepository;
import vehicle_management.repository.ICarRepository;

public class CarService implements ICarService {
    private final ICarRepository carRepository = new CarRepository();

    @Override
    public void add(Car car) {
        carRepository.add(car);
    }

    @Override
    public Car[] findAll() {
        return carRepository.findAll();
    }

    @Override
    public void editByVehiclePlate(String vehiclePlate) {
        carRepository.editByVehiclePlate(vehiclePlate);
    }

    @Override
    public Car findByVehiclePlate(String vehiclePlate) {
        return carRepository.findByVehiclePlate(vehiclePlate);
    }

    @Override
    public boolean checkVehiclePlate(String vehiclePlate) {
        return carRepository.checkVehiclePlate(vehiclePlate);
    }

    @Override
    public void deleteByVehiclePlate(String vehiclePlate) {
       carRepository.deleteByVehiclePlate(vehiclePlate);
    }
}
